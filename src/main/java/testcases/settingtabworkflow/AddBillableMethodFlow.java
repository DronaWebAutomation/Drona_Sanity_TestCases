package testcases.settingtabworkflow;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import SettingTabWorkflowPage.AddBillableItem;

public class AddBillableMethodFlow {
	WebDriver driver;
	AddBillableItem AddBillableItem;
	
	public void AddBillable(WebDriver driver) throws InterruptedException {

		this.driver = driver;

	        AddBillableItem = new AddBillableItem(driver);
	        Thread.sleep(3000);
	        AddBillableItem.ClickBillingDetails();
	        Thread.sleep(3000);
	        AddBillableItem.ClickAddNewBillables();
	        Thread.sleep(3000);
	        AddBillableItem.AddServiceName("Bill one");
	        Thread.sleep(3000);
	        AddBillableItem.OpenSelectItemDropDown();
	        Thread.sleep(3000);
	        AddBillableItem.SelectItemValue();
	        Thread.sleep(3000);
	        AddBillableItem.EnterUitPrice("99");
	        Thread.sleep(3000);
	        AddBillableItem.ClickBillingSaveButton();
	        Thread.sleep(3000);
	        AddBillableItem.ClickHomeButton();
	        Thread.sleep(3000);
	
	}
}
