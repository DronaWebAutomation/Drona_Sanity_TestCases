package drona.smoketestcases;

import java.io.IOException;
import java.lang.reflect.Method;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Utility.MailReport;
import Utility.ReportManager;
import Utility.ScreenshotUtil;
import Utility.chromConfigure;
import testcases.appointmentflow.scheduleRescheduleCancelMethodFlow;
import testcases.billingflow.billMarkAsPaidMethodFlow;
import testcases.billingflow.createBillMethodFlow;
import testcases.consultationFlow.consultationUsingTemplateMethodFlow;
import testcases.consultationFlow.walkInConsultationMethodFlow;
import testcases.doctoronboardingflow.doctorOnboardingMethodFlow;
import testcases.fileuploadflow.uploadFilesMethodFlow;
import testcases.patientflow.AddFamilyMemeberMethodFlow;
import testcases.patientflow.addNewPatientMethodFlow;
import testcases.patientflow.editPatientMethodFlow;
import testcases.sentMail.sendMailProcess;
import testcases.settingtabworkflow.AddAssistantMethodFlow;
import testcases.settingtabworkflow.AddBillableMethodFlow;
import testcases.settingtabworkflow.EditClinicDetailsMethodFlow;

public class mainClass {

    private WebDriver driver;
    private MailReport mailReport; // Instance of MailReport

    @BeforeSuite
    public void initializeReports() {
        // Initialize ExtentReports
        ReportManager.initializeReports();

        // Initialize MailReport
        mailReport = new MailReport();
        mailReport.initializeReport();  // Initialize the mail report (HTML structure)
    }

    @BeforeTest
    public void setup(ITestContext context) throws IOException {
        // Setup WebDriver
        chromConfigure chromConfig = new chromConfigure();
        driver = chromConfig.dronachromsetup();


        // Log environment setup completion
        ReportManager.startTest("Setup");
        ReportManager.logPass("Environment setup completed successfully.");
    }
    
  @Test(priority = 1)
  public void doctorOnboardingWorkflowTest() throws IOException {
      ReportManager.startTest("Doctor Onboarding Workflow");
      String startTime = java.time.LocalTime.now().toString();

      try {
          new doctorOnboardingMethodFlow().doctorOnboardingFlow(driver);
          ReportManager.logPass("Doctor Onboarding Workflow executed successfully.");
          mailReport.addTestCaseRow("Doctor Onboarding Workflow", "Doctor Onboarding", startTime, java.time.LocalTime.now().toString(), "Passed");
      } catch (Exception e) {
          handleError("Doctor Onboarding Workflow", e);
          mailReport.addTestCaseRow("Doctor Onboarding Workflow", "Doctor Onboarding", startTime, null, "Failed"); // Mark as failed
      }
  }

    @Test(priority = 2)
    public void loginWorkflowTest() throws IOException {
        ReportManager.startTest("Login Workflow");
        String startTime = java.time.LocalTime.now().toString();

        try {
            new LoginFlow.loginFlowMethod().Login(driver);
            ReportManager.logPass("Login Workflow executed successfully.");
            mailReport.addTestCaseRow("Login Workflow", "Login", startTime, java.time.LocalTime.now().toString(), "Passed");
        } catch (Exception e) {
            handleError("Login Workflow", e);
            mailReport.addTestCaseRow("Login Workflow", "Login", startTime, null, "Failed"); // Mark as failed
        }
    }
    
    @Test(priority = 3)
    public void appointmentWorkflowTest() throws IOException {
        ReportManager.startTest("Appointment Workflow");
        String startTime = java.time.LocalTime.now().toString();
        scheduleRescheduleCancelMethodFlow appointmentFlow = new scheduleRescheduleCancelMethodFlow();
        

        try {
            appointmentFlow.scheduleRescheduleCancelFlow(driver);
            ReportManager.logPass("Appointment Workflow executed successfully.");
            mailReport.addTestCaseRow("appointmentFlow", "scheduleRescheduleCancelFlow", startTime, java.time.LocalTime.now().toString(), "Passed");
        } catch (Exception e) {
            handleError("Appointment Workflow", e);
            mailReport.addTestCaseRow("appointmentFlow", "scheduleRescheduleCancelFlow", startTime, null, "Failed"); // Mark as failed
        }
    }

    @Test(priority = 4)
    public void billMarkAsPaidWorkflowTest() throws IOException {
        ReportManager.startTest("Bill MarkAsPaid Workflow");
        String startTime = java.time.LocalTime.now().toString();
        billMarkAsPaidMethodFlow billFlow = new billMarkAsPaidMethodFlow();

        try {
            billFlow.billMarkAsPaid(driver);
            ReportManager.logPass("Bill MarkAsPaid Workflow executed successfully.");
            mailReport.addTestCaseRow("billFlow", "billMarkAsPaid", startTime, java.time.LocalTime.now().toString(), "Passed");
        } catch (Exception e) {
            handleError("Bill MarkAsPaid Workflow", e);
            mailReport.addTestCaseRow("billFlow", "billMarkAsPaid", startTime, null, "Failed"); // Mark as failed
        }
    }

    @Test(priority = 5)
    public void createBillWorkflowTest() throws IOException {
        // Start the test using ReportManager
        ReportManager.startTest("Create Bill Workflow");
        
        // Capture the start time of the test
        String startTime = java.time.LocalTime.now().toString();

        try {
            // Execute the Create Bill workflow
            new createBillMethodFlow().createBillFlow(driver);
            
            // Log the success to the report
            ReportManager.logPass("Create Bill Workflow executed successfully.");
            
            // Add a test case row to the mail report (with passed status)
            mailReport.addTestCaseRow("Create Bill Workflow", "Create Bill", startTime, java.time.LocalTime.now().toString(), "Passed");
        } catch (Exception e) {
            // Log failure in case of an exception
            handleError("Create Bill Workflow", e);
            
            // Add a test case row to the mail report (with failed status)
            mailReport.addTestCaseRow("Create Bill Workflow", "Create Bill", startTime, null, "Failed");
        }
    }

    @Test(priority = 6)
    public void consultationUsingTemplateWorkflowTest() throws IOException {
        // Start the test using ReportManager
        ReportManager.startTest("Consultation Using Template Workflow");
        
        // Capture the start time of the test
        String startTime = java.time.LocalTime.now().toString();

        try {
            // Execute the Consultation Using Template workflow
            new consultationUsingTemplateMethodFlow().consultationUsingTemplate(driver);
            
            // Log the success to the report
            ReportManager.logPass("Consultation Using Template Workflow executed successfully.");
            
            // Add a test case row to the mail report (with passed status)
            mailReport.addTestCaseRow("Consultation Using Template Workflow", "Consultation Template", startTime, java.time.LocalTime.now().toString(), "Passed");
        } catch (Exception e) {
            // Log failure in case of an exception
            handleError("Consultation Using Template Workflow", e);
            
            // Add a test case row to the mail report (with failed status)
            mailReport.addTestCaseRow("Consultation Using Template Workflow", "Consultation Template", startTime, null, "Failed");
        }
    }

    @Test(priority = 7)
    public void walkInConsultationWorkflowTest() throws IOException {
        // Start the test using ReportManager
        ReportManager.startTest("Walk-In Consultation Workflow");
        
        // Capture the start time of the test
        String startTime = java.time.LocalTime.now().toString();

        try {
            // Execute the Walk-In Consultation workflow
            new walkInConsultationMethodFlow().walkInConsultationFlow(driver);
            
            // Log the success to the report
            ReportManager.logPass("Walk-In Consultation Workflow executed successfully.");
            
            // Add a test case row to the mail report (with passed status)
            mailReport.addTestCaseRow("Walk-In Consultation Workflow", "Walk-In Consultation", startTime, java.time.LocalTime.now().toString(), "Passed");
        } catch (Exception e) {
            // Log failure in case of an exception
            handleError("Walk-In Consultation Workflow", e);
            
            // Add a test case row to the mail report (with failed status)
            mailReport.addTestCaseRow("Walk-In Consultation Workflow", "Walk-In Consultation", startTime, null, "Failed");
        }
    }

    @Test(priority = 8)
    public void fileUploadWorkflowTest() throws IOException {
        // Start the test using ReportManager
        ReportManager.startTest("File Upload Workflow");
        
        // Capture the start time of the test
        String startTime = java.time.LocalTime.now().toString();

        try {
            // Execute the File Upload workflow
            new uploadFilesMethodFlow().uploadFilesFlowTest(driver);
            
            // Log the success to the report
            ReportManager.logPass("File Upload Workflow executed successfully.");
            
            // Add a test case row to the mail report (with passed status)
            mailReport.addTestCaseRow("File Upload Workflow", "File Upload", startTime, java.time.LocalTime.now().toString(), "Passed");
        } catch (Exception e) {
            // Log failure in case of an exception
            handleError("File Upload Workflow", e);
            
            // Add a test case row to the mail report (with failed status)
            mailReport.addTestCaseRow("File Upload Workflow", "File Upload", startTime, null, "Failed");
        }
    }

    @Test(priority = 9)
    public void editPatientWorkflowTest() throws IOException {
        // Start the test using ReportManager
        ReportManager.startTest("Edit Patient Workflow");
        
        // Capture the start time of the test
        String startTime = java.time.LocalTime.now().toString();

        try {
            // Execute the Edit Patient workflow
            new editPatientMethodFlow().editPatientFlow(driver);
            
            // Log the success to the report
            ReportManager.logPass("Edit Patient Workflow executed successfully.");
            
            // Add a test case row to the mail report (with passed status)
            mailReport.addTestCaseRow("Edit Patient Workflow", "Edit Patient", startTime, java.time.LocalTime.now().toString(), "Passed");
        } catch (Exception e) {
            // Log failure in case of an exception
            handleError("Edit Patient Workflow", e);
            
            // Add a test case row to the mail report (with failed status)
            mailReport.addTestCaseRow("Edit Patient Workflow", "Edit Patient", startTime, null, "Failed");
        }
    }

    @Test(priority = 10)
    public void addNewPatientWorkflowTest() throws IOException {
        // Start the test using ReportManager
        ReportManager.startTest("Add New Patient Workflow");
        
        // Capture the start time of the test
        String startTime = java.time.LocalTime.now().toString();

        try {
            // Execute the Add New Patient workflow
            new addNewPatientMethodFlow().addNewPatientFlow(driver);
            
            // Log the success to the report
            ReportManager.logPass("Add New Patient Workflow executed successfully.");
            
            // Add a test case row to the mail report (with passed status)
            mailReport.addTestCaseRow("Add New Patient Workflow", "Add New Patient", startTime, java.time.LocalTime.now().toString(), "Passed");
        } catch (Exception e) {
            // Log failure in case of an exception
            handleError("Add New Patient Workflow", e);
            
            // Add a test case row to the mail report (with failed status)
            mailReport.addTestCaseRow("Add New Patient Workflow", "Add New Patient", startTime, null, "Failed");
        }
    }  
    
    @Test(priority = 11)
    public void addFamilyMemberWorkflowTest() throws IOException {
        // Start the test using ReportManager
        ReportManager.startTest("Add Family Member Workflow");

        // Capture the start time of the test
        String startTime = java.time.LocalTime.now().toString();

        try {
            // Execute the Add Family Member workflow
            new AddFamilyMemeberMethodFlow().AddFamilyMemeberFlow(driver);

            // Log the success to the report
            ReportManager.logPass("Add Family Member Workflow executed successfully.");

            // Add a test case row to the mail report (with passed status)
            mailReport.addTestCaseRow("Add Family Member Workflow", "Add Family Member", startTime, java.time.LocalTime.now().toString(), "Passed");
        } catch (Exception e) {
            // Log failure in case of an exception
            handleError("Add Family Member Workflow", e);

            // Add a test case row to the mail report (with failed status)
            mailReport.addTestCaseRow("Add Family Member Workflow", "Add Family Member", startTime, null, "Failed");
        }
    }

    @Test(priority = 12)
    public void addAssistantWorkflowTest() throws IOException {
        // Start the test using ReportManager
        ReportManager.startTest("Add Assistant Workflow");

        // Capture the start time of the test
        String startTime = java.time.LocalTime.now().toString();

        try {
            // Execute the Add Assistant workflow
            new AddAssistantMethodFlow().AddAssistantFlow(driver);

            // Log the success to the report
            ReportManager.logPass("Add Assistant Workflow executed successfully.");

            // Add a test case row to the mail report (with passed status)
            mailReport.addTestCaseRow("Add Assistant Workflow", "Add Assistant", startTime, java.time.LocalTime.now().toString(), "Passed");
        } catch (Exception e) {
            // Log failure in case of an exception
            handleError("Add Assistant Workflow", e);

            // Add a test case row to the mail report (with failed status)
            mailReport.addTestCaseRow("Add Assistant Workflow", "Add Assistant", startTime, null, "Failed");
        }
    }

    @Test(priority = 13)
    public void addBillableItemWorkflowTest() throws IOException {
        // Start the test using ReportManager
        ReportManager.startTest("Add Billable Item Workflow");

        // Capture the start time of the test
        String startTime = java.time.LocalTime.now().toString();

        try {
            // Execute the Add Billable Item workflow
            new AddBillableMethodFlow().AddBillable(driver);

            // Log the success to the report
            ReportManager.logPass("Add Billable Item Workflow executed successfully.");

            // Add a test case row to the mail report (with passed status)
            mailReport.addTestCaseRow("Add Billable Item Workflow", "Add Billable Item", startTime, java.time.LocalTime.now().toString(), "Passed");
        } catch (Exception e) {
            // Log failure in case of an exception
            handleError("Add Billable Item Workflow", e);

            // Add a test case row to the mail report (with failed status)
            mailReport.addTestCaseRow("Add Billable Item Workflow", "Add Billable Item", startTime, null, "Failed");
        }
    }

    @Test(priority = 14)
    public void editClinicDetailsWorkflowTest() throws IOException {
        // Start the test using ReportManager
        ReportManager.startTest("Edit Clinic Details Workflow");

        // Capture the start time of the test
        String startTime = java.time.LocalTime.now().toString();

        try {
            // Execute the Edit Clinic Details workflow
            new EditClinicDetailsMethodFlow().EditClinicDetails(driver);

            // Log the success to the report
            ReportManager.logPass("Edit Clinic Details Workflow executed successfully.");

            // Add a test case row to the mail report (with passed status)
            mailReport.addTestCaseRow("Edit Clinic Details Workflow", "Edit Clinic Details", startTime, java.time.LocalTime.now().toString(), "Passed");
        } catch (Exception e) {
            // Log failure in case of an exception
            handleError("Edit Clinic Details Workflow", e);

            // Add a test case row to the mail report (with failed status)
            mailReport.addTestCaseRow("Edit Clinic Details Workflow", "Edit Clinic Details", startTime, null, "Failed");
        }
    }

    @AfterMethod
    public void checkTestStatus(Method m, ITestResult result) throws IOException {
        ReportManager.checkStatus(m, result);
    }

    private void handleError(String workflowName, Exception e) throws IOException {
        String screenshotPath = ScreenshotUtil.captureScreenshot(driver, workflowName);
        ReportManager.logFail(workflowName + " failed.", screenshotPath, e);
    }

    @AfterSuite
    public void finalizeReports() {
        // Finalize Extent Reports
        ReportManager.finalizeReports();


        // Finalize Mail Report
        mailReport.finalizeReport(System.getProperty("user.dir")); // Save report in the project directory
        sendMailProcess mailSender = new sendMailProcess(driver);
        mailSender.SendEmail();
       

        // Quit WebDriver
        if (driver != null) {
            driver.quit();
        }

    }
}
