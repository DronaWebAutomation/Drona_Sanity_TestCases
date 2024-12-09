package testcases.appointmentflow;
	 
	import org.openqa.selenium.By;

	import org.openqa.selenium.JavascriptExecutor;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;

import AppointmentFlowPage.scheduleRescheduleCancel;
	 
	public class scheduleRescheduleCancelMethodFlow {
	 
		WebDriver driver;
		scheduleRescheduleCancel schedule_reschdule_cancel_flow;
	 
				public void scheduleRescheduleCancelFlow(WebDriver driver) throws InterruptedException {

			this.driver = driver;
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
	 
	        Thread.sleep(2000);
	        schedule_reschdule_cancel_flow.pending_section_3dot();
	        Thread.sleep(2000);
	        schedule_reschdule_cancel_flow.reschdule_button();
	        Thread.sleep(2000);
	        schedule_reschdule_cancel_flow.select_time_slote_reschdule();
	        Thread.sleep(2000);
	        schedule_reschdule_cancel_flow.confirm_appoinment_reschdule();
	        driver.navigate().refresh();
	        
	        Thread.sleep(2000);

	 
	        driver.navigate().refresh();
	 
	        Thread.sleep(2000);
	        schedule_reschdule_cancel_flow.pending_section_3dot();
	        Thread.sleep(2000);
	        schedule_reschdule_cancel_flow.cancel_button();
	        Thread.sleep(2000);
	        schedule_reschdule_cancel_flow.select_cancel_reason();
	        Thread.sleep(2000);
	        schedule_reschdule_cancel_flow.confirm_cancel_button();
	        Thread.sleep(3000);
	 
	        driver.navigate().refresh();
	 
	        Thread.sleep(3000);
	        schedule_reschdule_cancel_flow.pending_section_3dot();
	        Thread.sleep(2000);
	        schedule_reschdule_cancel_flow.click_delete_button();
	 
	 
	}
				
				
	}

	 