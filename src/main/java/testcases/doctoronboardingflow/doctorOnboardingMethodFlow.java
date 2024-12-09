package testcases.doctoronboardingflow;
import java.time.Duration;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DoctorOnboardingPage.doctorOnboardingFlow;
import LoginPage.loginFlowTest;

public class doctorOnboardingMethodFlow {
	WebDriver driver;
	doctorOnboardingFlow doctorOnboardingFlow;
	loginFlowTest objLoginPage;
	 
		public void doctorOnboardingFlow(WebDriver driver) throws InterruptedException {

		this.driver = driver;
    	doctorOnboardingFlow = new doctorOnboardingFlow(driver);
    	objLoginPage = new loginFlowTest(driver);
        Thread.sleep(1000);
        doctorOnboardingFlow.EnterDoctorMobileNo("");
        Thread.sleep(1000);
        objLoginPage.continueBtn();
        Thread.sleep(1000);
        doctorOnboardingFlow.EnterDoctorEmail("testsharma@gmail.com");
        Thread.sleep(1000);
        doctorOnboardingFlow.EnterDoctorFirstName("Test");
        Thread.sleep(1000);
        doctorOnboardingFlow.EnterDoctorLastName("Sharma");
        Thread.sleep(1000);
        doctorOnboardingFlow.EnterDoctorPassword("Test@123");
        Thread.sleep(1000);
        doctorOnboardingFlow.EnterDoctorRePassword("Test@123");
        Thread.sleep(1000);
        doctorOnboardingFlow.ClickSignUp();
        Thread.sleep(1000);
        doctorOnboardingFlow.EnterOTP("999999");
        Thread.sleep(1000);
        objLoginPage.loginBtn();
        Thread.sleep(2000);
        doctorOnboardingFlow.ClickAddProfilePic("C:\\Users\\rahul.sharma_tpr\\Downloads\\DoctorPic.jpg");
        Thread.sleep(1000);
        doctorOnboardingFlow.SelectGender();
        Thread.sleep(1000);
        doctorOnboardingFlow.EnterQualification("MNNH");
        Thread.sleep(1000);
        doctorOnboardingFlow.ClickSpecialityDropdown();
        Thread.sleep(1000);
        doctorOnboardingFlow.SelectSpeciality();
        Thread.sleep(1000);
        doctorOnboardingFlow.ClickStateDropdown();
        Thread.sleep(1000);
        doctorOnboardingFlow.SelectState();
        Thread.sleep(1000);
        doctorOnboardingFlow.EnterRegistrationNo("");
        Thread.sleep(1000);
        doctorOnboardingFlow.ClickCountinueButton();
        Thread.sleep(1000);
        doctorOnboardingFlow.EnterPromoCode("DR23_QC");
        Thread.sleep(1000);
        doctorOnboardingFlow.ClickApplyButton();
        Thread.sleep(2000);
        doctorOnboardingFlow.ClickAccountactiveCountinue();
        Thread.sleep(3000);
        doctorOnboardingFlow.ClickClinicSetup();
        Thread.sleep(1000);
        doctorOnboardingFlow.AddClinicPicture("C:\\Users\\rahul.sharma_tpr\\Downloads\\profilepic.jpg");
        Thread.sleep(1000);
        doctorOnboardingFlow.EnterClinicName("Yuvaansh Clinic");
        Thread.sleep(1000);
        doctorOnboardingFlow.EnterCityName("Bathinda");
        Thread.sleep(3000);
        doctorOnboardingFlow.SelectCityDropdown();
        Thread.sleep(3000);
        doctorOnboardingFlow.SaveClinicDetails();
        Thread.sleep(3000);
        doctorOnboardingFlow.SaveSlotTime();
        Thread.sleep(2000);
        doctorOnboardingFlow.EnterConsultationFee("2");
        Thread.sleep(1000);
        doctorOnboardingFlow.EnterFollowupFee("1");
        Thread.sleep(1000);
        doctorOnboardingFlow.EnterFollowupDays("2");
        Thread.sleep(1000);
        doctorOnboardingFlow.SaveFeeDays();
        Thread.sleep(2000);
        doctorOnboardingFlow.ClickToHomePage();
        Thread.sleep(2000);
        doctorOnboardingFlow.ClickDoctorProfile();
        Thread.sleep(2000);
        doctorOnboardingFlow.ClickLogoutButton();
        Thread.sleep(2000);
        doctorOnboardingFlow.ConfirmLogout();
        System.out.println("DoctorOnboardSuccessfully");

	}
	
}
