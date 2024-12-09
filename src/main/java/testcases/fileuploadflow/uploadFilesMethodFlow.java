package testcases.fileuploadflow;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FileUploadFlowPage.uploadFilesFlow;
import PatientFlowPage.addNewPatientFlow;
import PatientFlowPage.editPatientFlow;

public class uploadFilesMethodFlow {
		WebDriver driver;
		uploadFilesFlow uploadFilesFlow;;
		editPatientFlow editpatientflow;
		addNewPatientFlow dailyworkdone;
				
		public void uploadFilesFlowTest(WebDriver driver) throws InterruptedException {

			this.driver = driver;
	        editpatientflow = new editPatientFlow(driver);
	        Thread.sleep(3000);
	        dailyworkdone = new addNewPatientFlow(driver);
	        Thread.sleep(3000);
	        uploadFilesFlow = new uploadFilesFlow(driver);
	        Thread.sleep(3000);
	        dailyworkdone.allpatienttab();
	        Thread.sleep(3000);
	        editpatientflow.click_3_dot();
	        Thread.sleep(3000);
	        editpatientflow.edit_patinet_deatils();
	        Thread.sleep(3000);
	        uploadFilesFlow.ClickFileOption();
	        Thread.sleep(3000);
	        uploadFilesFlow.ClickAddNewOption();
	        Thread.sleep(3000);
	        uploadFilesFlow.ClickBrowseFileOption("C:\\Users\\rahul.sharma_tpr\\Downloads\\TestUpload.jpg");
	        Thread.sleep(3000);
	        uploadFilesFlow.EnterFileName("TestUpload file");
	        Thread.sleep(3000);
	        uploadFilesFlow.SelectRecordType();
	        Thread.sleep(3000);
	        uploadFilesFlow.ClickFileSaveButton();
	        Thread.sleep(3000);
	        uploadFilesFlow.ClickFile3dot();
	        Thread.sleep(3000);
	        uploadFilesFlow.ClickFileDelete();
	        Thread.sleep(3000);
	        driver.navigate().refresh();
			

		}	

}
