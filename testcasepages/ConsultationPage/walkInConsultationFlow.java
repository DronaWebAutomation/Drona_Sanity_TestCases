package ConsultationPage;

	import org.openqa.selenium.By;

	import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.Robot;
	import java.awt.event.KeyEvent;

	public class walkInConsultationFlow {

		WebDriver driver;

		By AllPatientBtn = By.xpath("//*[@class=\"home-all-patient\"]");

		By ConsultBtn = By.xpath("(//button[@type='button'][normalize-space()='Consult Now'])[1]");
		
		//Add vitals Xpath
		By VitalHight = By.xpath("//div[@class='vital-n-flex ng-star-inserted']//div[1]//ul[1]//li[2]//div[1]//div[1]//input[1]");
		By VitalWeight = By.xpath("(//input[@class='vi-input1 p-inputtext p-component ng-valid ng-touched ng-dirty'])[1]");
		By VitalTemprature = By.xpath("//div[@id='vital-new-p']//div[3]//ul[1]//li[2]//div[1]//div[1]//input[1]");
		By VitalSPO2 = By.xpath("//div[4]//ul[1]//li[2]//div[1]//div[1]//input[1]");
		By VitalBP1 = By.xpath("(//input[@class='vi-input1 vi-l1 p-inputtext p-component ng-untouched ng-pristine ng-valid'])[1]");
		By VitalBP2 = By.xpath("(//input[@class='vi-input1 vi-l2 p-inputtext p-component ng-untouched ng-pristine ng-valid'])[1]");
		By VitalPulse = By.xpath("//input[@class='vi-input1 p-inputtext p-component ng-untouched ng-pristine ng-valid']");

		//Add Investigation Xpath
		By AddInvestigation = By.xpath("//input[@placeholder='Search for investigation']");
		By InvestigationDetails = By.xpath("//b[normalize-space()='Testosterone Free (ng/dL)']");
		By ClickAddDate = By.xpath("//h6[normalize-space()='Add Date']");
		By SelectDate = By.xpath("//span[contains(@class, 'ng-tns') and contains(@class, 'p-ripple') and text()='1']");
		By EnterInvestigationUnit = By.xpath("//input[@placeholder='Enter']");
		
		By Treatmentbtn = By.xpath("//*[@placeholder=\"Search or add Treatment\"]");
		By TreatmentCost = By.xpath("//input[@class='treatment-plan-grid-txt ng-untouched ng-pristine ng-valid']");
		By ToothBtn = By.xpath("//input[@placeholder='Tooth No.']");
		By Entertooth = By.xpath("//label[@class='pointer'][normalize-space()='Lower']");	
		By Addtooth = By.xpath("//button[normalize-space()='Add']");
		By AddDescription = By.xpath("//input[@placeholder='Description']");
		By AddAmount = By.xpath("//input[@placeholder='Paid Amount']");
		
		By enetrChifComplaint = By.xpath("//input[@placeholder='Search or add symptoms']");
		By AddSymptoms = By.xpath("//span[normalize-space()='1 day']");
		By ChifSeverity = By.xpath("//span[normalize-space()='Mild']");
		By ChifNotes = By.xpath("/html[1]/body[1]/app-root[1]/app-master-side-menu[1]/ng-sidebar-container[1]/div[1]/div[1]/div[1]/app-consult-patient[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/p-accordion[1]/div[1]/p-accordiontab[3]/div[1]/div[2]/div[1]/div[1]/div[6]/p-autocomplete[1]/span[1]/input[1]");
		
		By AddDiagnosis = By.xpath("//input[@placeholder='Search or add diagnosis']");
		By AddSince = By.xpath("//span[normalize-space()='1 week']");
		//By AddSinceValue = By.xpath(""); 
		By DiagnosisStatus = By.xpath("//span[normalize-space()='Confirmed']");
		By DiagnosisNotes = By.xpath("/html[1]/body[1]/app-root[1]/app-master-side-menu[1]/ng-sidebar-container[1]/div[1]/div[1]/div[1]/app-consult-patient[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/p-accordion[1]/div[1]/p-accordiontab[5]/div[1]/div[2]/div[1]/div[1]/div[6]/p-autocomplete[1]/span[1]/input[1]");

		By AddFindings = By.xpath("//input[@placeholder='Search or add findings']");
		By AddSeverity = By.xpath("//span[normalize-space()='Mild']");
		By FindingNotes = By.xpath("/html[1]/body[1]/app-root[1]/app-master-side-menu[1]/ng-sidebar-container[1]/div[1]/div[1]/div[1]/app-consult-patient[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/p-accordion[1]/div[1]/p-accordiontab[4]/div[1]/div[2]/div[1]/div[2]/div[5]/p-autocomplete[1]/span[1]/input[1]");

		By AddMedicine = By.xpath("//input[@placeholder='Search for a medicine']");
		By SelectMedicine = By.xpath("//p-accordiontab[@id='medicineTop']//li[1]//div[1]");
		By SelectUnits = By.xpath("//span[normalize-space()='Capsule']");
		By SelectDosage = By.xpath("//span[normalize-space()='1-0-1']");
		By SelectWhen = By.xpath("//span[normalize-space()='After Lunch']");
		By SelectFrequency = By.xpath("//span[normalize-space()='Monthly']");
		By SelectDuration = By.xpath("//span[normalize-space()='1 day']");
		By ClickPlusIcon = By.xpath("//i[@class='pi systmic-finding-plus img-fluid-duration medicine-plus-img-duration ml-2 pointer-duration pi-plus']");
		By selectTo = By.xpath("//input[@placeholder='To']");
		By selectTovalue = By.xpath("//span[normalize-space()='1 day']");
		By MedicineNotes = By.xpath("/html[1]/body[1]/app-root[1]/app-master-side-menu[1]/ng-sidebar-container[1]/div[1]/div[1]/div[1]/app-consult-patient[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/p-accordion[1]/div[1]/p-accordiontab[6]/div[1]/div[2]/div[1]/div[1]/app-medicine-table[1]/div[1]/div[1]/div[1]/div[7]/div[1]/textarea[1]");
		
		By AddAdvisedInvestigation = By.xpath("//input[@placeholder='Search to add investigations']");
		By AdvisedInvestigationNotes = By.xpath("/html[1]/body[1]/app-root[1]/app-master-side-menu[1]/ng-sidebar-container[1]/div[1]/div[1]/div[1]/app-consult-patient[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/p-accordion[1]/div[1]/p-accordiontab[7]/div[1]/div[2]/div[1]/div[1]/div[4]/p-autocomplete[1]/span[1]/input[1]");

		By AddInstruction = By.xpath("//input[@placeholder='Search to add instruction']");

		By PrescriptionNotes = By.xpath("//*[@placeholder=\"Type a note\"]");

		By Savepreview = By.xpath("//*[@class=\"consult-s-btn drona-Primary_v2 ng-star-inserted\"]");

		By Followupdate = By.xpath("(//*[@class=\"follow-up-day pointer\"])[1]");
		
		By ClickOnPrint = By.xpath("//img[@alt='down']");
		By SelectDigitalRx = By.xpath("//a[normalize-space()='Digital Rx']");
		

		By Whatsappcomplete = By.xpath("(//*[@class=\"conslt-prev-btn tooltip gray-bg\"])[1]");


		public walkInConsultationFlow(WebDriver driver) {

			this.driver = driver;

		}

		public void AllPatientBtn() {
			WebElement element = driver.findElement(AllPatientBtn);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);

//		driver.findElement(AllPatientBtn).click();

		}

		public void ConsultBtn() {

			driver.findElement(ConsultBtn).click();

		}
		//Vital Method
		
		public void VitalHight (String arg1) {

			driver.findElement(VitalHight).sendKeys(arg1);

		}
		public void VitalWeight(String arg1) {

			driver.findElement(VitalWeight).sendKeys(arg1);

		}
		public void VitalTemprature(String arg1) {

			driver.findElement(VitalTemprature).sendKeys(arg1);

		}
		public void VitalSPO2(String arg1) {

			driver.findElement(VitalSPO2).sendKeys(arg1);

		}
		public void VitalBP1(String arg1) {

			driver.findElement(VitalBP1).sendKeys(arg1);

		}
		public void VitalBP2(String arg1) {

			driver.findElement(VitalBP2).sendKeys(arg1);

		}
		public void VitalPulse(String arg1) {

			driver.findElement(VitalPulse).sendKeys(arg1);

		}
		
		//Investigation Result
		
		public void AddInvestigation(String arg1) {
//			WebElement element = driver.findElement(AddInvestigation);
//			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//			element.sendKeys(arg1);

			driver.findElement(AddInvestigation).sendKeys(arg1);
		}
		public void InvestigationDetails() {

			driver.findElement(InvestigationDetails).click();

		}
		public void ClickAddDate() {

			driver.findElement(ClickAddDate).click();

		}
		public void SelectDate() {
			WebElement calendar = driver.findElement(SelectDate);  // Replace with actual ID or selector
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", calendar);


			//driver.findElement(SelectDate).click();

		}
		public void EnterInvestigationUnit(String arg1) {

			driver.findElement(EnterInvestigationUnit).sendKeys(arg1);

		}
		
		//Treatment Details


		public void Treatmentbtn(String arg1) {

			driver.findElement(Treatmentbtn).sendKeys(arg1);

		}
		public void TreatmentCost(String arg1) {

			driver.findElement(TreatmentCost).sendKeys(arg1);

		}


		public void ToothBtn() {
			WebElement element = driver.findElement(ToothBtn);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();

			//driver.findElement(ToothBtn).click();

		}

		public void Entertooth() {

			driver.findElement(Entertooth).click();

		}

		public void Addtooth() {
			WebElement element = driver.findElement(Addtooth);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);


		}
		public void AddDescription(String arg1) {

			driver.findElement(AddDescription).sendKeys(arg1);

		}
		public void AddAmount(String arg1) {

			driver.findElement(AddAmount).sendKeys(arg1);

		}
		
		//ChiefComplaint
		
		public void enetrChifComplaint(String arg1) {

			driver.findElement(enetrChifComplaint).sendKeys(arg1);

		}
		public void AddSymptoms() {
			WebElement element = driver.findElement(AddSymptoms);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);

			//driver.findElement(AddSymptoms).click();

		}
		public void ChifSeverity() {

			driver.findElement(ChifSeverity).click();

		}
		public void ChifNotes(String arg1) {

			driver.findElement(ChifNotes).sendKeys(arg1);
		}
		
		//Diagnosis
		
		public void AddDiagnosis(String arg1) {

			driver.findElement(AddDiagnosis).sendKeys(arg1);

		}
//		public void AddSinceValue(String arg1) {
//
//			driver.findElement(AddSinceValue).sendKeys(arg1);
//
//		}
		public void AddSince() {

			WebElement element =driver.findElement(AddSince);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);

		}
		public void DiagnosisStatus() {
			WebElement element =driver.findElement(DiagnosisStatus);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);

			//driver.findElement(DiagnosisStatus).click();

		}
		public void DiagnosisNotes(String arg1) {

			driver.findElement(DiagnosisNotes).sendKeys(arg1);

		}
		
		//Findings
		public void AddFindings(String arg1) {

			driver.findElement(AddFindings).sendKeys(arg1);

		}
		public void AddSeverity() {
			try {
			WebElement element =driver.findElement(AddSeverity);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			}
			catch(Exception e) {}

			//driver.findElement(AddSeverity).click();

		}
		public void FindingNotes(String arg1) {

			driver.findElement(FindingNotes).sendKeys(arg1);

		}
		
		//Add Medicine process
		
		public void AddMedicine(String arg1) {

			driver.findElement(AddMedicine).sendKeys(arg1);

		}
		public void SelectMedicine() {

			driver.findElement(SelectMedicine).click();

		}
		public void SelectUnits() {
			try {
			WebElement element =driver.findElement(SelectUnits);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			}
			catch(Exception e) {}
			

			//driver.findElement(SelectUnits).click();

		}
		public void SelectDosage() {
			try {
			WebElement element =driver.findElement(SelectDosage);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			}
			catch(Exception e) {}

			//driver.findElement(SelectDosage).click();

		}
		public void SelectWhen() {
			try {
			WebElement element =driver.findElement(SelectWhen);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			}
			catch(Exception e) {}

			//driver.findElement(SelectWhen).click();

		}
		public void SelectFrequency() {
			try {
			WebElement element =driver.findElement(SelectFrequency);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			}
			catch(Exception e) {}

			//driver.findElement(SelectFrequency).click();

		}
		public void SelectDuration() {
			try {
			WebElement element =driver.findElement(SelectDuration);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			}
			catch(Exception e) {}

			//driver.findElement(SelectDuration).click();

		}
		public void ClickPlusIcon() {

			driver.findElement(ClickPlusIcon).click();

		}
		public void selectTo() {

			driver.findElement(selectTo).click();

		}
		public void selectTovalue() {

			driver.findElement(selectTovalue).click();

		}
		public void MedicineNotes(String arg1) {

			driver.findElement(MedicineNotes).sendKeys(arg1);

		}
		//Add Advised Investigation
		public void AddAdvisedInvestigation (String arg1) {

			driver.findElement(AddAdvisedInvestigation).sendKeys(arg1);

		}
		public void AdvisedInvestigationNotes (String arg1) {

			driver.findElement(AdvisedInvestigationNotes).sendKeys(arg1);

		}

        //Instruction
		public void AddInstruction(String arg1) {
			WebElement element = driver.findElement(AddInstruction);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.sendKeys(arg1);
		}

		public void PrescriptionNotes(String arg1) {

			driver.findElement(PrescriptionNotes).sendKeys(arg1);

		}

		public void Savepreview()

		{

		driver.findElement(Savepreview).click();

	}

		public void Followupdate()

		{

			WebElement element = driver.findElement(Followupdate);

			JavascriptExecutor executor = (JavascriptExecutor)driver;

			executor.executeScript("arguments[0].click();", element);

		}
		
		// print
		public void ClickOnPrint ()

		{

		driver.findElement(ClickOnPrint).click();

	}
		public void SelectDigitalRx()

		{

		driver.findElement(SelectDigitalRx).click();

	}

		
		//cancelPrint Preview page
		  public void cancelPrintDialog() {
		        try {
		            // Create an instance of Robot class
		            Robot robot = new Robot();

		            // Add a small delay to ensure the print dialog has appeared
		            robot.delay(2000); // 2 seconds

		            // Press and release the ESC key to close the print dialog
		            robot.keyPress(KeyEvent.VK_ESCAPE);
		            robot.keyRelease(KeyEvent.VK_ESCAPE);

		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		     
		    }
		    
		        
		  

		public void Whatsappcomplete()

		{

			driver.findElement(Whatsappcomplete).click();

		}


	}












 
