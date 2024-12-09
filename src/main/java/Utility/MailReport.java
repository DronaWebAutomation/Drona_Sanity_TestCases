
package Utility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class MailReport {

    private StringBuilder report;
    private int passedTests = 0;
    private int failedTests = 0;
    private int skippedTests = 0;

    public void initializeReport() {
        // Initialize the report structure
        this.report = new StringBuilder();
        String currentDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

        // Add HTML structure, styles, and Chart.js for enhanced visuals
        report.append("<!DOCTYPE html>");
        report.append("<html lang='en'><head><meta charset='UTF-8'><meta name='viewport' content='width=device-width, initial-scale=1.0'>");
       // report.append("<title>Automation Test Report</title>");
        report.append("<style>");
        report.append("body { font-family: Arial, sans-serif; margin: 0; padding: 0; background-color: #FFFFFF; color: #333; }");
        report.append("header { padding: 20px; text-align: center; background-color: #4CAF50; color: white; }");
        report.append("h1 { margin: 0; font-size: 2rem; }");
        report.append("table { width: 100%; border-collapse: collapse; margin: 5px auto; }");
        report.append("th, td { padding: 12px; text-align: left; border: 2px solid #ddd; }");
        report.append("th { background-color: #fae8e8; }");
        report.append("tr:nth-child(even) { background-color: #f2cbcb; }");
        report.append("tr:hover { background-color: #f2cbcb; }");
        report.append("canvas { margin: 20px auto; display: block; }");
        report.append("</style>");
        report.append("<script src='https://cdn.jsdelivr.net/npm/chart.js'></script></head><body>");
       // report.append("<header><h1>Automation Test Report</h1>");
        report.append("<p>Generated on: ").append(currentDate).append("</p></header>");
        report.append("<table><thead><tr>");
        report.append("<th>Test Name</th><th>Method Name</th><th>Status</th><th>Start Time</th><th>End Time</th>");
        report.append("</tr></thead><tbody>");
    }

    // Method to add a row for each test case
    public void addTestCaseRow(String testName, String method, String startTime, String endTime, String status) {
        report.append("<tr");

        // Optional: Alternate row colors for better readability
        if ((passedTests + failedTests + skippedTests) % 2 == 0) {
            report.append(" style='background-color: #f2f2f2;'");
        }

        report.append("><td>").append(testName).append("</td>");
        report.append("<td>").append(method).append("</td>");

        // Update counters based on status and add a styled status cell
        switch (status.toLowerCase()) {
            case "passed":
                passedTests++;
                report.append("<td style='color: #28a745; font-weight: bold;'>").append("Passed").append("</td>");
                break;
            case "failed":
                failedTests++;
                report.append("<td style='color: #dc3545; font-weight: bold;'>").append("Failed").append("</td>");
                break;
            case "skipped":
                skippedTests++;
                report.append("<td style='color: #ffc107; font-weight: bold;'>").append("Skipped").append("</td>");
                break;
            default:
                report.append("<td>").append("Unknown").append("</td>");
        }

        report.append("<td>").append(startTime).append("</td>");
        report.append("<td>").append((endTime != null ? endTime : "N/A")).append("</td></tr>");
    }

    // Finalize the report with a pie chart and save to file
    public void finalizeReport(String outputDirectory) {
        // Close the table and add a canvas for the chart
        report.append("</tbody></table><canvas id='testChart' width='600' height='400'></canvas>");

        // Add Chart.js for displaying a pie chart
        report.append("<script>");
        report.append("var ctx = document.getElementById('testChart').getContext('2d');");
        report.append("var chart = new Chart(ctx, {");
        report.append("type: 'pie',");
        report.append("data: {");
        report.append("labels: ['Passed', 'Failed', 'Skipped'],");
        report.append("datasets: [{");
        report.append("label: 'Test Results',");
        report.append("data: [").append(passedTests).append(", ").append(failedTests).append(", ").append(skippedTests).append("],");
        report.append("backgroundColor: ['#28a745', '#dc3545', '#ffc107'],");
        report.append("borderWidth: 1");
        report.append("}]");
        report.append("},");
        report.append("options: {");
        report.append("responsive: true,");
        report.append("plugins: {");
        report.append("legend: { position: 'top' },");
        report.append("title: { display: true, text: 'Test Results Summary' }");
        report.append("}");
        report.append("}");
        report.append("});");
        report.append("</script>");
        report.append("</body></html>");

        // Write the report to an HTML file
        try (FileWriter writer = new FileWriter(outputDirectory + "/custom-emailable-report.html")) {
            writer.write(report.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Capture a screenshot and return the file path
    public static String captureScreenshot(WebDriver driver, String screenshotName) {
        try {
            // Capture the screenshot
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String filePath = System.getProperty("user.dir") + "/screenshots/" + screenshotName + "_" + System.currentTimeMillis() + ".png";

            // Save the screenshot
            File destFile = new File(filePath);
            FileUtils.copyFile(scrFile, destFile);

            return filePath;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
