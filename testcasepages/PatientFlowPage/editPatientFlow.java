package PatientFlowPage;


	 
	import org.openqa.selenium.By;

	import org.openqa.selenium.JavascriptExecutor;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;

	public class editPatientFlow {
	 
		WebDriver driver;
	 
		By click_3_dot = By.xpath("(//img[@class='img-fluid pointer'])[7]");
	 
		By edit_patinet_deatils = By

				.xpath("//div[@class='dropdown-menu dropdown-margin show']//a[span[text()='Patient Details']]");

		By patient_details_dropdown = By.xpath("//div[@class='home-page-design patient-list-scroller']//app-all-patient//div[@class='right-sidemenu-overlay']//div[@class='inner-wrapper']//app-right-side-menu//div[@class='right-side-panel drona_Card-Color_v2 ng-star-inserted']//div[@class='r-s-flex1']//div[@class='p-grid']//div[@id='dropdownMenuLink']//div[@id='dropdownMenuLink']//i[@class='fa fa-ellipsis-h']");

		By edit_patient = By.xpath("//div[@class='dropdown-menu dropdown-margin show']//a[@class='dropdown-item list-font'][normalize-space()='Edit Patient']");

		By edit_fullname = By.xpath("//input[@id='txtClinicName']");

		By edit_age = By.xpath("//input[@id='txtCity']");

		By save_details_button = By

				.xpath("//button[contains(@class, 'drona-primary') and contains(@class, 'next-button')]");

		By backarrowicon = By.xpath("//img[@alt='back arrow']");

	 
		public editPatientFlow(WebDriver driver) {

			this.driver = driver;

		}
	 
		public void click_3_dot() {
			WebElement element = driver.findElement(click_3_dot);

			JavascriptExecutor executor = (JavascriptExecutor) driver;

			executor.executeScript("arguments[0].click();", element);
	 
			//driver.findElement(click_3_dot).click();

		}
	 
		public void edit_patinet_deatils() {

			driver.findElement(edit_patinet_deatils).click();
	 
		}
	 
		public void patient_details_dropdown() {

			WebElement element = driver.findElement(patient_details_dropdown);

			JavascriptExecutor executor = (JavascriptExecutor) driver;

			executor.executeScript("arguments[0].click();", element);

		}
	 
		public void edit_patient()
	 
		{

			driver.findElement(edit_patient).click();

		}
	 
		public void edit_fullname(String arg1)
	 
		{

			driver.findElement(edit_fullname).clear();
	 
			driver.findElement(edit_fullname).sendKeys(arg1);
	 
		}
	 
		public void edit_age(String arg1)
	 
		{
	 
			driver.findElement(edit_age).clear();

			driver.findElement(edit_age).sendKeys(arg1);

			driver.findElement(save_details_button).click();
	 
		}
	 
	/*	public void save_details_button()
	 
		{

			driver.findElement(save_details_button).click();

		}*/

		public void backarrowicon()
	 
		{

			WebElement element = driver.findElement(backarrowicon);

			JavascriptExecutor executor = (JavascriptExecutor) driver;

			executor.executeScript("arguments[0].click();", element);

			//driver.findElement(backarrowicon).click();

		}
	 
	 
	}

	 
