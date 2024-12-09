package testcases.billingflow;


	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

import AppointmentFlowPage.scheduleRescheduleCancel;
import BillingFlowPage.billCreateMarkAsPaid;

	public class billMarkAsPaidMethodFlow {

		WebDriver driver;
		billCreateMarkAsPaid markasPaidflow;
		scheduleRescheduleCancel schedule_reschdule_cancel_flow;
	 
		
		public void billMarkAsPaid(WebDriver driver) throws InterruptedException {

			this.driver = driver;
	    	markasPaidflow = new billCreateMarkAsPaid(driver);
	        schedule_reschdule_cancel_flow = new scheduleRescheduleCancel(driver);
	        Thread.sleep(2000);
	        schedule_reschdule_cancel_flow.schedulebutton();
	        schedule_reschdule_cancel_flow.searchboxbar("test");
	        Thread.sleep(2000);
	        schedule_reschdule_cancel_flow.select_patient();
	        Thread.sleep(2000);
	        schedule_reschdule_cancel_flow.schedule_appointmnet();
	        Thread.sleep(2000);
	        schedule_reschdule_cancel_flow.select_time_slote();
	        Thread.sleep(2000);
	        schedule_reschdule_cancel_flow.confirmappoinment_button();

	        driver.navigate().refresh();
	        
	        Thread.sleep(3000);
	        markasPaidflow.click_markaspaid();
	        Thread.sleep(3000);
	        markasPaidflow.enter_paid_amount("1");
	        Thread.sleep(3000);
	        markasPaidflow.click_save_button();
	        Thread.sleep(3000);
	        markasPaidflow.click_cross_icon();

				}

	 
	}
