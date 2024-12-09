package testcases.billingflow;
	 
	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BillingFlowPage.createBill;


	 
	public class createBillMethodFlow {

		WebDriver driver;
		createBill createbillflow;
	 
			 
		public void createBillFlow(WebDriver driver) throws InterruptedException {

			this.driver = driver;
	    	createbillflow = new createBill(driver);
	        Thread.sleep(2000);
	        createbillflow.Bill_3dot_click();
	        Thread.sleep(2000);
	        createbillflow.Click_create_bill();
	        Thread.sleep(2000);
	        createbillflow.click_add_item();
	        Thread.sleep(2000);
	        createbillflow.select_item();
	        Thread.sleep(2000);
	        createbillflow.add_paid_amount("1");
	        Thread.sleep(2000);
	        createbillflow.click_markpaid();
	        Thread.sleep(6000);
	        createbillflow.click_whatsapp();
	        Thread.sleep(4000);
	        createbillflow.click_cross_icon();

		}
	}