package AppointmentFlowPage;
	 
	import org.openqa.selenium.By;

	import org.openqa.selenium.JavascriptExecutor;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
	 
	public class scheduleRescheduleCancel {
	 
		WebDriver driver;
	 
		By schedulebutton = By.xpath("//button[@id='dropdownAddnew']");
	 
		By searchboxbar = By.xpath("//*[@class=\"w-100 search-input p-inputtext p-component\"]");

		By select_patient = By.xpath("(//span[@class='Pname-v2'])[1]");

		By schedule_appointmnet = By.xpath("//button[@type='button'][normalize-space()='Schedule Appointment']");

		By select_time_slote = By.xpath("//*[@class=\"time-v2-slot\"][1]");

		By confirmappoinment_button = By.xpath("//*[@class=\"confirmation-button-appoint drona-Primary_v2\"]");

		By pending_section_3dot = By.xpath("//*[@class=\"img-fluid pointer\"] [1]");

		By reschdule_button = By.xpath("//div[@class='dropdown-menu dropdown-margin show']//span[contains(text(),'Reschedule')]");

		By select_time_slote_reschdule = By.xpath("//*[@class=\"time-v2-slot\"][1]");

		By confirm_appoinment_reschdule = By.xpath("//span[normalize-space()='Confirm Appointment']");

		By cancel_button = By.xpath("//div[@class='dropdown-menu dropdown-margin show']//span[contains(text(),'Cancel Appointment')]");

		By select_cancel_reason = By.xpath("//p-radiobutton[@value='Patient not available']//div[@class='p-radiobutton-box']");

		By confirm_cancel_button = By.xpath("//button[normalize-space()='Yes, Cancel']");

		By click_delete_button = By.xpath("//span[normalize-space()='Delete']");

	 
		public scheduleRescheduleCancel(WebDriver driver) {

			this.driver = driver;

		}
	 
		public void schedulebutton() {
	 
			driver.findElement(schedulebutton).click();

		}
	 
		public void searchboxbar(String arg1) {

			driver.findElement(searchboxbar).sendKeys(arg1);
	 
		}
	 
		public void select_patient() {

			WebElement element = driver.findElement(select_patient);

			JavascriptExecutor executor = (JavascriptExecutor) driver;

			executor.executeScript("arguments[0].click();", element);

			driver.findElement(select_patient).click();

		}
	 
		public void schedule_appointmnet()
	 
		{

			driver.findElement(schedule_appointmnet).click();

		}
	 
		public void select_time_slote()
	 
		{
	 
			driver.findElement(select_time_slote).click();
	 
		}
	 
		public void confirmappoinment_button()
	 
		{
	 
			driver.findElement(confirmappoinment_button).click();
	 
		}

		public void pending_section_3dot()
	 
		{

			driver.findElement(pending_section_3dot).click();
	 
		}

		public void reschdule_button ()
	 
		{
	 
			driver.findElement(reschdule_button).click();
	 
		}

		public void select_time_slote_reschdule()
	 
		{
	 
			driver.findElement(select_time_slote_reschdule).click();
	 
		}

		public void confirm_appoinment_reschdule()
	 
		{
	 
			driver.findElement(confirm_appoinment_reschdule).click();
	 
		}

		public void cancel_button()
	 
		{
	 
			driver.findElement(cancel_button).click();
	 
		}
	 
		public void select_cancel_reason()
	 
		{
	 
			driver.findElement(select_cancel_reason).click();
	 
		}
	 
		public void confirm_cancel_button ()
	 
		{
	 
			driver.findElement(confirm_cancel_button).click();
	 
		}

		public void click_delete_button ()
	 
		{
	 
			driver.findElement(click_delete_button).click();
	 
		}

	 
	 
	}

	 