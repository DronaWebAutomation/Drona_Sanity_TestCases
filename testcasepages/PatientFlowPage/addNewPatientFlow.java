package PatientFlowPage;

	import java.time.Duration;

	import org.openqa.selenium.By;

	import org.openqa.selenium.JavascriptExecutor;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.support.ui.ExpectedConditions;

	import org.openqa.selenium.support.ui.WebDriverWait;

	import java.util.Random;

	import java.util.UUID;
	
	public class addNewPatientFlow {
	 
	 
		WebDriver driver;
	 
		By allpatienttab = By.xpath("//*[@class=\"home-all-patient\"]");

		By addnewpatienticon = By.xpath("//img[@class='img-fluid-1 heroicons-outline_user pointer']");
	 
		By entermobileno = By

				.xpath("//input[@placeholder='Enter Mobile Number']");

		By enterfullname = By.xpath("//*[@id=\"txtClinicName\"]");

		By selectgender = By.xpath(

				"//div[@role='button' and @class='p-button p-component p-ripple ng-star-inserted' and @aria-pressed='false' and @aria-labelledby='Male']");

		By selectage = By.xpath("//*[@formcontrolname =\"age\"]");

		By addpatientbutton = By.xpath("//*[@class=\"drona-primary next-button drona-Primary_v2 p-button p-component\"]");
	 
		public addNewPatientFlow(WebDriver driver) {

			this.driver = driver;

		}
	 
		public void allpatienttab() {

			driver.findElement(allpatienttab).click();
	 
		}
	 
		public void addnewpatienticon() {

			WebElement element = driver.findElement(addnewpatienticon);

			JavascriptExecutor executor = (JavascriptExecutor) driver;

			executor.executeScript("arguments[0].click();", element);
	 
		}
	 
		public void entermobileno(String arg1) {

			Random random = new Random();

			long tenDigitNumber = 1000000000L + (long) (random.nextDouble() * 9000000000L);

			driver.findElement(entermobileno).sendKeys(String.valueOf(tenDigitNumber));
	 
		}
	 
		public void enterfullname(String arg1) {
	 
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(enterfullname));

			String randomString = UUID.randomUUID().toString().replace("-", "").substring(0, 10);
	 
			element.sendKeys(randomString);

		}
	 
		public void selectgender()
	 
		{

			driver.findElement(selectgender).click();

		}
	 
		public void selectage(String arg1)
	 
		{

			driver.findElement(selectage).sendKeys(arg1);

		}
	 
		public void addpatientbutton()
	 
		{

			driver.findElement(addpatientbutton).click();

		}
	 
	}

	 
