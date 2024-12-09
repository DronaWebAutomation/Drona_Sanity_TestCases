package testcases.consultationFlow;

	import org.openqa.selenium.By;

	import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ConsultationPage.walkInConsultationFlow;
import PatientFlowPage.addNewPatientFlow;

import java.awt.Robot;
	import java.awt.event.KeyEvent;

	public class walkInConsultationMethodFlow {

		WebDriver driver;
		walkInConsultationFlow ConsultationFlowTest;
		addNewPatientFlow dailyworkdone;

		

		public void walkInConsultationFlow(WebDriver driver) throws InterruptedException {

			this.driver = driver;
	    	ConsultationFlowTest = new walkInConsultationFlow(driver);
	    	dailyworkdone = new addNewPatientFlow(driver);
	    	Thread.sleep(2000);
	    	ConsultationFlowTest.AllPatientBtn();
	    	Thread.sleep(2000);
	        dailyworkdone.addnewpatienticon();
	        Thread.sleep(3000);
	        dailyworkdone.entermobileno("7468347738");
	        Thread.sleep(3000);
	        dailyworkdone.enterfullname("Avinash Singh");
	        dailyworkdone.selectgender();
	        dailyworkdone.selectage("55");
	        Thread.sleep(3000);
	        dailyworkdone.addpatientbutton();
	        Thread.sleep(2000);
	        ConsultationFlowTest.ConsultBtn();
	        Thread.sleep(10000);
	        ConsultationFlowTest.VitalHight("99"+ Keys.TAB);
	        //Thread.sleep(2000);
	       // ConsultationFlowTest.VitalWeight("99"+ Keys.TAB);
	        Thread.sleep(2000);
	        ConsultationFlowTest.VitalTemprature("99"+ Keys.TAB);
	        Thread.sleep(2000);
	        ConsultationFlowTest.VitalSPO2("99" + Keys.TAB);
	        Thread.sleep(2000);
	        ConsultationFlowTest.VitalBP1("99" + Keys.TAB);
	        Thread.sleep(2000);
	        ConsultationFlowTest.VitalBP2("99" + Keys.TAB);
	        Thread.sleep(2000);
	        ConsultationFlowTest.VitalPulse("99" + Keys.TAB);
	        Thread.sleep(2000);
	        ConsultationFlowTest.AddInvestigation("Test");
	        Thread.sleep(2000);
	        ConsultationFlowTest.InvestigationDetails();
	        Thread.sleep(2000);
	        ConsultationFlowTest.ClickAddDate();
	        Thread.sleep(2000);
	        ConsultationFlowTest.SelectDate();
	        Thread.sleep(2000);
	        ConsultationFlowTest.EnterInvestigationUnit("900");
	        Thread.sleep(2000);
	        ConsultationFlowTest.Treatmentbtn("TEST TREATMENT" + Keys.ENTER);
	        Thread.sleep(2000);
	        ConsultationFlowTest.TreatmentCost("2000");
	        Thread.sleep(2000);
	        ConsultationFlowTest.ToothBtn();
	        Thread.sleep(2000);
	        ConsultationFlowTest.Entertooth();
	        Thread.sleep(2000);
	        ConsultationFlowTest.Addtooth();
	        Thread.sleep(2000);
	        ConsultationFlowTest.AddDescription("Entered The Text to Test the Treatment Description");
	        Thread.sleep(2000);
	        ConsultationFlowTest.AddAmount("1000");
	        Thread.sleep(2000);
	        ConsultationFlowTest.enetrChifComplaint("Test Chiefcomplaint one" + Keys.ENTER);
	        Thread.sleep(2000);
	        ConsultationFlowTest.AddSymptoms();
	        Thread.sleep(2000);
	        ConsultationFlowTest.ChifSeverity();
	        Thread.sleep(2000);
	        ConsultationFlowTest.ChifNotes("Test Notes in Cheif Complaint");
	        Thread.sleep(2000);
	        ConsultationFlowTest.AddDiagnosis("Test Diagnisis" + Keys.ENTER);
	        Thread.sleep(2000);
	        ConsultationFlowTest.AddSince();
	        Thread.sleep(2000);
	        ConsultationFlowTest.DiagnosisStatus();
	        Thread.sleep(2000);
	        ConsultationFlowTest.DiagnosisNotes("Test Diagnosis Notes for Test");
	        Thread.sleep(2000);
	        ConsultationFlowTest.AddFindings("Test Findings" + Keys.ENTER);
	        Thread.sleep(3000);
	        ConsultationFlowTest.AddSeverity();
	        Thread.sleep(2000);
	        ConsultationFlowTest.FindingNotes("Test Finding Notes For test");
	        Thread.sleep(2000);
	        ConsultationFlowTest.AddMedicine("Nuroace-P 75Mg (/750Y) Capsule");
	        Thread.sleep(2000);
	        ConsultationFlowTest.SelectMedicine();
	        Thread.sleep(2000);
	        ConsultationFlowTest.SelectUnits();
	        Thread.sleep(2000);
	        ConsultationFlowTest.SelectDosage();
	        Thread.sleep(2000);
	        ConsultationFlowTest.SelectWhen();
	        Thread.sleep(2000);
	        ConsultationFlowTest.SelectFrequency();
	        Thread.sleep(2000);
	        ConsultationFlowTest.SelectDuration();
	        Thread.sleep(2000);
	        ConsultationFlowTest.ClickPlusIcon();
	        Thread.sleep(2000);
	        ConsultationFlowTest.selectTo();
	        Thread.sleep(2000);
	        ConsultationFlowTest.selectTovalue();
	        Thread.sleep(2000);
	        ConsultationFlowTest.MedicineNotes("Test Medicine Notes to check the testing");
	        Thread.sleep(2000);
	        ConsultationFlowTest.AddAdvisedInvestigation("Test Investigation" + Keys.ENTER);
	        Thread.sleep(2000);
	        ConsultationFlowTest.AdvisedInvestigationNotes("Test Advised Investigation Notes to check the testing");
	        Thread.sleep(2000);
	        ConsultationFlowTest.AddInstruction("Test Instruction" + Keys.ENTER);
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












 
