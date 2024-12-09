package testcases.patientflow;

	import java.time.Duration;

	import org.openqa.selenium.By;

	import org.openqa.selenium.JavascriptExecutor;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.support.ui.ExpectedConditions;

	import org.openqa.selenium.support.ui.WebDriverWait;

import PatientFlowPage.addNewPatientFlow;

import java.util.Random;

	import java.util.UUID;

	public class addNewPatientMethodFlow {
	 
	 
		WebDriver driver;
		addNewPatientFlow dailyworkdone;
	 
			 
		public void addNewPatientFlow(WebDriver driver) throws InterruptedException {

			this.driver = driver;
	        Thread.sleep(3000);
	        dailyworkdone = new addNewPatientFlow(driver);
	        Thread.sleep(3000);
	        dailyworkdone.addnewpatienticon();
	        Thread.sleep(3000);
	        dailyworkdone.entermobileno("7468347738");
	        Thread.sleep(3000);
	        dailyworkdone.enterfullname("Avinash Singh");
	        dailyworkdone.selectgender();
	        dailyworkdone.selectage("55");
	        Thread.sleep(3000);
	        dailyworkdone.addpatientbutton();

			 
	}
	}

	 
