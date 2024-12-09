package SettingTabWorkflowPage;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class EditClinicDetails {
	WebDriver driver;
	 
	By ClickSettingTab = By.xpath("//span[normalize-space()='Settings']");
	By ClinicEditButton = By.xpath("//div[@class='p-col-12 p-sm-1 p-md-1 p-xl-1 mt-8']//div[@class='capital-hospital-edit-h'][normalize-space()='Edit']");
	By EditClinicName = By.xpath("//div[@class='p-grid mt-32']//input[@id='txtClinicName']");
	By EditCompleteAddress = By.xpath("//div[@class='box-clinic']//div[@class='p-grid']//input[@id='txtClinicName']");
	By SaveClinicDetails = By.xpath("//button[normalize-space()='Save']");
	By EditConsultationTimeButton = By.xpath("//div[@class='p-col-1']//div[@class='capital-hospital-edit-h'][normalize-space()='Edit']");
	By EditSlotLength = By.xpath("/html[1]/body[1]/app-root[1]/app-master-side-menu[1]/ng-sidebar-container[1]/div[1]/div[1]/div[1]/app-set-up-clinic-update[1]/div[1]/div[2]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/p-dropdown[1]/div[1]/input[1]");
	By SaveConsultationTimeDetails = By.xpath("//button[normalize-space()='Save']");
	
	public EditClinicDetails(WebDriver driver) {

		this.driver = driver;

	}
 
	public void ClickSettingTab() {
 
		driver.findElement(ClickSettingTab).click();

	}
	public void ClinicEditButton() {
		 
		driver.findElement(ClinicEditButton).click();

	}
	public void EditClinicName(String arg1)
	 
	{
 
		driver.findElement(EditClinicName).clear();

		driver.findElement(EditClinicName).sendKeys(arg1);

 
	}
	public void EditCompleteAddress(String arg1)
	 
	{
 
		driver.findElement(EditCompleteAddress).clear();

		driver.findElement(EditCompleteAddress).sendKeys(arg1);

 
	}
	public void SaveClinicDetails() {
		 
		driver.findElement(SaveClinicDetails).click();

	}
	public void EditConsultationTimeButton() {
		 
		driver.findElement(EditConsultationTimeButton).click();

	}
	public void EditSlotLength(String arg1)
	 
	{
		WebElement element = driver.findElement(EditSlotLength);
		driver.findElement(EditSlotLength).clear();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.sendKeys(arg1);
 
		//driver.findElement(EditSlotLength).clear();

		//driver.findElement(EditSlotLength).sendKeys(arg1);

 
	}
	public void SaveConsultationTimeDetails() {
		 
		driver.findElement(SaveConsultationTimeDetails).click();

	}
 


}
