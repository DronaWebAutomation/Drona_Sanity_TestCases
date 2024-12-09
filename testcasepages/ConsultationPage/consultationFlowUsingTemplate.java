package ConsultationPage;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class consultationFlowUsingTemplate {
	
	WebDriver driver;

	By PendingConsultButton = By.xpath("(//button[@type='button'][normalize-space()='C'])[1]");
	By ClickUseExistingTemplate = By.xpath("//span[normalize-space()='Use Existing Template']");
	By ClickLoadTemplateButton = By.xpath("(//span[contains(text(),'Load Template')])[1]");
	
	public consultationFlowUsingTemplate(WebDriver driver) {

		this.driver = driver;

	}
 
	public void PendingConsultButton() {
 
		driver.findElement(PendingConsultButton).click();

	}
	public void ClickUseExistingTemplate() {
		 
		driver.findElement(ClickUseExistingTemplate).click();

	}
	public void ClickLoadTemplateButton() {
		 
		driver.findElement(ClickLoadTemplateButton).click();

	}

}
