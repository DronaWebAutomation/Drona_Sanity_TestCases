package FileUploadFlowPage;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uploadFilesFlow {
		WebDriver driver;
		
		By ClickFileOption = By.xpath("//span[normalize-space()='Files']");
		By ClickAddNewOption = By.xpath("//h4[normalize-space()='Add New']");
		By ClickBrowseFileOption = By.xpath("//input[@type='file']");
		By EnterFileName = By.xpath("//input[@placeholder='Enter the title']");
		By SelectRecordType = By.xpath("//div[@class='right-sidemenu-overlay']//li[2]//div[1]//span[1]");
		By ClickFileSaveButton = By.xpath("//span[normalize-space()='Save']");
		By ClickFile3dot = By.xpath("//img[@class='img-fluid 3-dot-img']");
		By ClickFileDelete = By.xpath("//a[normalize-space()='Delete']");
		
		public uploadFilesFlow(WebDriver driver) {

			this.driver = driver;

		}
	 
		public void ClickFileOption() {
	 
			driver.findElement(ClickFileOption).click();

		}
		public void ClickAddNewOption() {
			 
			driver.findElement(ClickAddNewOption).click();

		}
		public void ClickBrowseFileOption(String arg1) {

			 
			driver.findElement(ClickBrowseFileOption).sendKeys(arg1);

		}
		public void EnterFileName(String arg1) {
			 
			driver.findElement(EnterFileName).sendKeys(arg1);

		}
		public void SelectRecordType() {
			WebElement element = driver.findElement(SelectRecordType);

			JavascriptExecutor executor = (JavascriptExecutor) driver;

			executor.executeScript("arguments[0].click();", element);
			 
			//driver.findElement(SelectRecordType).click();

		}
		public void ClickFileSaveButton() {
			 
			driver.findElement(ClickFileSaveButton).click();

		}
		public void ClickFile3dot() {
			 
			driver.findElement(ClickFile3dot).click();

		}
		public void ClickFileDelete () {
			 
			driver.findElement(ClickFileDelete).click();

		}
		 
	

}
