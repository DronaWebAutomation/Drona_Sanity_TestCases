package testcases.patientflow;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v129.page.Page;

import PatientFlowPage.AddFamilyMemeber;
import PatientFlowPage.addNewPatientFlow;
import PatientFlowPage.editPatientFlow;
import SettingTabWorkflowPage.EditClinicDetails;


public class AddFamilyMemeberMethodFlow {
	
	WebDriver driver;
	AddFamilyMemeber AddFamilyMemeber;
	editPatientFlow editpatientflow;
    addNewPatientFlow dailyworkdone;
	 
 
		public void AddFamilyMemeberFlow(WebDriver driver) throws InterruptedException {

		this.driver = driver;
        dailyworkdone = new addNewPatientFlow(driver);
    AddFamilyMemeber = new AddFamilyMemeber(driver);
    editpatientflow = new editPatientFlow(driver);
        Thread.sleep(3000);
//        dailyworkdone.allpatienttab();
//    
//    Thread.sleep(3000);
        editpatientflow.click_3_dot();
        Thread.sleep(3000);
        AddFamilyMemeber.SelectAddfamily();
        Thread.sleep(3000);
        AddFamilyMemeber.ClickTitleField();
        Thread.sleep(3000);
        AddFamilyMemeber.SelectTitle();
        Thread.sleep(3000);
        AddFamilyMemeber.AddFamilyMemberName("Test Sharma");
        Thread.sleep(3000);
        AddFamilyMemeber.ClickRelationDropdown();
        Thread.sleep(3000);
        AddFamilyMemeber.SelectRelation();
        Thread.sleep(3000);
        AddFamilyMemeber.FamilyMemberAge("99");
        Thread.sleep(3000);
        AddFamilyMemeber.AddFamilyMemeberButton();
        Thread.sleep(6000);
        driver.navigate().refresh();


	
}
}
