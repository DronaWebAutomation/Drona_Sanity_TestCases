package SettingTabWorkflowPage;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddAssistantFlow {
	WebDriver driver;
	 
	By ClickAddAssistantButton = By.xpath("//span[@class='p-button-label']");
	By AssistantFirstName = By.xpath("//input[@placeholder='First Name']");
	By AssistantLastName = By.xpath("//input[@placeholder='Last Name']");
	By SelectAssistantGender = By.xpath("//span[normalize-space()='Male']");
	By AssistantMobileNo = By.xpath("//input[@placeholder='Enter Mobile Number']");
	By SaveAssistantDetails = By.xpath("//button[@class='btn add-assistant-bth1 drona-Primary_v2 ng-star-inserted']");
	By ClickAssistantDelete = By.xpath("//app-staff[@class='ng-star-inserted']//div[2]//div[3]//div[1]//div[1]//div[1]//div[1]");
	By ConfirmDeleteAssistant = By.xpath("//button[normalize-space()='Yes, Delete']");
	
	public AddAssistantFlow(WebDriver driver) {

		this.driver = driver;

	}
 
	public void ClickAddAssistantButton() {
		WebElement element = driver.findElement(ClickAddAssistantButton);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
 
		//driver.findElement(ClickAddAssistantButton).click();

	}
	public void AssistantFirstName(String arg1)
	 
	{

		driver.findElement(AssistantFirstName).sendKeys(arg1);

 
	}
	public void AssistantLastName(String arg1)
	 
	{

		driver.findElement(AssistantLastName).sendKeys(arg1);

 
	}
	public void SelectAssistantGender() {
		 
		driver.findElement(SelectAssistantGender).click();

	}
	public void AssistantMobileNo(String arg1)
	 
	{

		Random random = new Random();

		long tenDigitNumber = 1000000000L + (long) (random.nextDouble() * 9000000000L);

		driver.findElement(AssistantMobileNo).sendKeys(String.valueOf(tenDigitNumber));

 
	}
	public void SaveAssistantDetails() throws InterruptedException {
		WebElement element = driver.findElement(SaveAssistantDetails);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		Thread.sleep(6000);
		 
		//driver.findElement(SaveAssistantDetails).click();

	}
	public void ClickAssistantDelete () {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ClickAssistantDelete));
		

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();


	}
	public void ConfirmDeleteAssistant () {
		 
		driver.findElement(ConfirmDeleteAssistant).click();

	}

}
