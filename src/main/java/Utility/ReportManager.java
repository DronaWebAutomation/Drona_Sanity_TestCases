package Utility;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportManager {

    private static ExtentReports reports;
    private static ThreadLocal<ExtentTest> testThreadLocal = new ThreadLocal<>();
    private static final Map<String, Integer> stats = new HashMap<>();

    // Initialize test result counters
    static {
        stats.put("Pass", 0);
        stats.put("Fail", 0);
        stats.put("Skip", 0);
    }

    public static void initializeReports() {
        // Generate a unique report file name using a timestamp
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
       // String reportFileName = "automationreport_" + timestamp + ".html";
        String reportFileName = "automationreport.html";

        // Create a Spark Reporter
        ExtentSparkReporter spark = new ExtentSparkReporter(reportFileName);
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Drona Smoke Testing");
        spark.config().setTheme(Theme.DARK);

        // Create the ExtentReports instance and attach the reporter
        reports = new ExtentReports();
        reports.attachReporter(spark);

        // Add System Information
        reports.setSystemInfo("OS", "Windows 11");
        reports.setSystemInfo("Browser", "Chrome");
        reports.setSystemInfo("Environment", "UAT");
        reports.setSystemInfo("Tested By", "Rahul Sharma");
    }

    public static ExtentTest startTest(String testName) {
        // Create a new test instance and store it in ThreadLocal for thread safety
        ExtentTest test = reports.createTest(testName);
        testThreadLocal.set(test);
        return test;
    }

    public static void logPass(String message) {
        ExtentTest test = testThreadLocal.get();
        if (test != null) {
            test.pass(message);
        }
    }

    public static void logFail(String message, String screenshotPath, Throwable throwable) {
        ExtentTest test = testThreadLocal.get();
        if (test != null) {
            test.fail(message);
            test.fail(throwable);
            if (screenshotPath != null) {
                test.addScreenCaptureFromPath(screenshotPath);
            }
        }
    }

    public static void logSkip(String message) {
        ExtentTest test = testThreadLocal.get();
        if (test != null) {
            test.skip(message);
        }
    }

    public static void finalizeReports() {
        if (reports != null) {
            generateCharts(); // Generate charts before finalizing the report
            reports.flush();  // Ensure all data is written to the report
        }
    }

    public static void checkStatus(Method m, ITestResult result) throws IOException {
    	
        ExtentTest test = testThreadLocal.get();
        if (test == null) {
            throw new IllegalStateException("Test instance not initialized. Call startTest() before logging results.");
        }

        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, "Test Case FAILED: " + m.getName());
            test.fail(result.getThrowable());
            stats.put("Fail", stats.get("Fail") + 1);
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, "Test Case PASSED: " + m.getName());
            stats.put("Pass", stats.get("Pass") + 1);
        } else {
            test.log(Status.SKIP, "Test Case SKIPPED: " + m.getName());
            test.skip(result.getThrowable());
            stats.put("Skip", stats.get("Skip") + 1);
        }
    }

    private static void generateCharts() {
        // Create dataset
        CategoryDataset dataset = createDataset();

        // Create chart
        JFreeChart chart = ChartFactory.createBarChart(
            "Test Results Summary",
            "Category",
            "Counts",
            dataset
        );

        // Save chart as image
        File chartFile = new File("testResultsChart.png");
        try {
            ChartUtils.saveChartAsPNG(chartFile, chart, 600, 400);

            // Add chart to the report
            ExtentTest test = testThreadLocal.get();
            if (test != null) {
                test.addScreenCaptureFromPath("testResultsChart.png");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(stats.get("Pass"), "Results", "Pass");
        dataset.addValue(stats.get("Fail"), "Results", "Fail");
        dataset.addValue(stats.get("Skip"), "Results", "Skip");

        return dataset;
    }
}
