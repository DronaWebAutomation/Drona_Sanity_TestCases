package SettingTabWorkflowPage;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class AddBillableItem {
	WebDriver driver;
	 
	By ClickBillingDetails = By.xpath("//span[normalize-space()='Billing Details']");
	By ClickAddNewBillables = By.xpath("//p[@class='addNewBillables pointer ng-star-inserted']");
	By AddServiceName = By.xpath("//input[@class='billing-input p-inputtext p-component ng-untouched ng-pristine ng-valid']");
	By OpenSelectItemDropDown = By.xpath("//span[contains(text(), 'Select')]");
	By SelectItemValue = By.xpath("/html/body//li[contains(@class, 'p-dropdown-item') and .//span[text()='Service']]");
	By EnterUitPrice = By.xpath("//input[@class='billingitem-input p-inputtext p-component ng-untouched ng-pristine ng-valid']");
	By ClickBillingSaveButton = By.xpath("//button[contains(text(),'Save')]");
	By ClickHomeButton = By.xpath("//span[normalize-space()='Home']");
	
	public AddBillableItem(WebDriver driver) {

		this.driver = driver;
	}
	public void ClickBillingDetails() {
		WebElement element = driver.findElement(ClickBillingDetails);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		 
		//driver.findElement(ClickBillingDetails).click();

	}
	public void ClickAddNewBillables() {
		WebElement element = driver.findElement(ClickAddNewBillables);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

	}
	public void AddServiceName(String arg1)
	 
	{

		driver.findElement(AddServiceName).sendKeys(arg1);
 
	}
	public void OpenSelectItemDropDown() {
		WebElement element = driver.findElement(OpenSelectItemDropDown);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		 
		//driver.findElement(OpenSelectItemDropDown).click();

	}
	public void SelectItemValue() {
		WebElement element = driver.findElement(SelectItemValue);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		 
		//driver.findElement(OpenSelectItemDropDown).click();

	}
	public void EnterUitPrice(String arg1) {
		 
		driver.findElement(EnterUitPrice).sendKeys(arg1);

	}
	public void ClickBillingSaveButton() {
		 
		driver.findElement(ClickBillingSaveButton).click();

	}
	public void ClickHomeButton() {
		 
		driver.findElement(ClickHomeButton).click();

	}
}
