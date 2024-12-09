package testcases.settingtabworkflow;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import SettingTabWorkflowPage.EditClinicDetails;

public class EditClinicDetailsMethodFlow {
	WebDriver driver;
	EditClinicDetails EditClinicDetails;
	 
	
	public void EditClinicDetails(WebDriver driver) throws InterruptedException {

		this.driver = driver;
        EditClinicDetails = new EditClinicDetails(driver);
        
        EditClinicDetails.ClickSettingTab();
        Thread.sleep(3000);
        EditClinicDetails.ClinicEditButton();
        Thread.sleep(3000);
        EditClinicDetails.EditClinicName("Sanjivni Health Clinic");
        Thread.sleep(3000);
        EditClinicDetails.EditCompleteAddress("St No 11 Paras Ram Nagar Bathinda Punjab");
        Thread.sleep(3000);
        EditClinicDetails.SaveClinicDetails();
        Thread.sleep(3000);
        EditClinicDetails.EditConsultationTimeButton();
        Thread.sleep(3000);
        EditClinicDetails.EditSlotLength("3");
        Thread.sleep(3000);
        EditClinicDetails.SaveConsultationTimeDetails();
	}
 


}
