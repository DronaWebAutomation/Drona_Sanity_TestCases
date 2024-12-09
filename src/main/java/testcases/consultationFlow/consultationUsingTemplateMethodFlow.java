package testcases.consultationFlow;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import AppointmentFlowPage.scheduleRescheduleCancel;
import ConsultationPage.consultationFlowUsingTemplate;
import ConsultationPage.walkInConsultationFlow;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class consultationUsingTemplateMethodFlow {
	
	WebDriver driver;
	consultationFlowUsingTemplate consultationFlowUsingTemplate;
	scheduleRescheduleCancel schedule_reschdule_cancel_flow;
	walkInConsultationFlow ConsultationFlowTest;
	
	
	public void consultationUsingTemplate(WebDriver driver) throws InterruptedException {

		this.driver = driver;
        schedule_reschdule_cancel_flow = new scheduleRescheduleCancel(driver);
        consultationFlowUsingTemplate = new consultationFlowUsingTemplate(driver);
        ConsultationFlowTest = new walkInConsultationFlow(driver);
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
        
      
        
        Thread.sleep(2000);
        consultationFlowUsingTemplate.PendingConsultButton();
        Thread.sleep(2000);
        consultationFlowUsingTemplate.ClickUseExistingTemplate();
        Thread.sleep(2000);
        consultationFlowUsingTemplate.ClickLoadTemplateButton();
        Thread.sleep(2000);
        ConsultationFlowTest.PrescriptionNotes("Enter Prescription to test the long notes");
        Thread.sleep(2000);
        ConsultationFlowTest.Savepreview();
        Thread.sleep(2000);
        ConsultationFlowTest.Followupdate();
        Thread.sleep(2000);
        ConsultationFlowTest.ClickOnPrint();
        Thread.sleep(2000);
        ConsultationFlowTest.SelectDigitalRx();
        Thread.sleep(8000);
        ConsultationFlowTest.cancelPrintDialog();
        Thread.sleep(4000);
        ConsultationFlowTest.Whatsappcomplete();
	}

}
