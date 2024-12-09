package testcases.patientflow;


	 
	import org.openqa.selenium.By;

	import org.openqa.selenium.JavascriptExecutor;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;

import PatientFlowPage.addNewPatientFlow;
import PatientFlowPage.editPatientFlow;

	public class editPatientMethodFlow {
	 
		WebDriver driver;
		editPatientFlow editpatientflow;
		addNewPatientFlow dailyworkdone;
	 
			 
		public void editPatientFlow(WebDriver driver) throws InterruptedException {

			this.driver = driver;
	        editpatientflow = new editPatientFlow(driver);
	        Thread.sleep(3000);
	        dailyworkdone = new addNewPatientFlow(driver);
	        Thread.sleep(3000);
	        dailyworkdone.allpatienttab();
	        Thread.sleep(3000);
	        editpatientflow.click_3_dot();
	        Thread.sleep(3000);
	        editpatientflow.edit_patinet_deatils();
	        Thread.sleep(3000);
	        editpatientflow.patient_details_dropdown();
	        Thread.sleep(3000);
	        editpatientflow.edit_patient();
	        Thread.sleep(3000);
	        editpatientflow.edit_fullname("test singh");
	        editpatientflow.edit_age("23");
	        Thread.sleep(3000);
	        editpatientflow.backarrowicon();
		}
	 
	 
	}

	 
