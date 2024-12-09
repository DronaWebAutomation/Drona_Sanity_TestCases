package testcases.settingtabworkflow;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SettingTabWorkflowPage.AddAssistantFlow;
import SettingTabWorkflowPage.EditClinicDetails;

public class AddAssistantMethodFlow {
	WebDriver driver;
	AddAssistantFlow AddAssistantFlow;
	EditClinicDetails EditClinicDetails;

	//public void AddAssistantMethodFlow(WebDriver driver) {

	
		public void AddAssistantFlow(WebDriver driver) throws InterruptedException {
			this.driver = driver;
		    EditClinicDetails = new EditClinicDetails(driver);  
		    Thread.sleep(3000);
			EditClinicDetails.ClickSettingTab();
	        AddAssistantFlow = new AddAssistantFlow(driver);
	        Thread.sleep(3000);
	        AddAssistantFlow.ClickAddAssistantButton();
	        Thread.sleep(3000);
	        AddAssistantFlow.AssistantFirstName("Assistant");
	        Thread.sleep(3000);
	        AddAssistantFlow.AssistantLastName("Sharma");
	        Thread.sleep(3000);
	        AddAssistantFlow.SelectAssistantGender();
	        Thread.sleep(3000);
	        AddAssistantFlow.AssistantMobileNo("");
	        Thread.sleep(3000);
	        AddAssistantFlow.SaveAssistantDetails();
	        Thread.sleep(3000);
	        AddAssistantFlow.ClickAssistantDelete();
	        Thread.sleep(3000);
	        AddAssistantFlow.ConfirmDeleteAssistant();        
	        
		    }

	}
 
