package DoctorOnboardingPage;
import java.time.Duration;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class doctorOnboardingFlow {
	WebDriver driver;
	 
	By EnterDoctorMobileNo = By.xpath("//input[@placeholder='Please Enter Mobile Number']");
	By EnterDoctorEmail = By.xpath("//input[@placeholder='Email Address*']");
	By EnterDoctorFirstName = By.xpath("//input[@placeholder='First Name*']");
	By EnterDoctorLastName = By.xpath("//input[@id='lastname']");
	By EnterDoctorPassword = By.xpath("//input[@placeholder='New Password*']");
	By EnterDoctorRePassword = By.xpath("//input[@placeholder='Re-enter New Password*']");
	By ClickSignUp = By.xpath("//span[normalize-space()='Sign Up']");
	By EnterOTP = By.xpath("//input[@placeholder='6-digit OTP']");
	By ClickVerifyButton = By.xpath("\"//*[@class=\\\"p-button-label\\\"]\"");
	By ClickAddProfilePic = By.xpath("//input[@type='file']");
	By SelectGender = By.xpath("//span[normalize-space()='Male']");
	By EnterQualification = By.xpath("//input[@placeholder='Enter your qualification']");
	By ClickSpecialityDropdown = By.xpath("/html[1]/body[1]/app-root[1]/app-login-layout[1]/app-registrationprocess[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/p-dropdown[1]/div[1]/span[1]");
	By SelectSpeciality = By.xpath("//li[@aria-label='Dentist']");
	By ClickStateDropdown = By.xpath("/html[1]/body[1]/app-root[1]/app-login-layout[1]/app-registrationprocess[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/p-dropdown[1]/div[1]/span[1]");
	By SelectState = By.xpath("//li[@aria-label='Delhi']");
	By EnterRegistrationNo = By.xpath("//input[@formcontrolname='registrationNumber']");
	By ClickCountinueButton = By.xpath("//span[normalize-space()='Continue']");
	By EnterPromoCode = By.xpath("//input[@placeholder='Enter Promocode']");
	By ClickApplyButton = By.xpath("//span[normalize-space()='Apply']");
	By ClickAccountactiveCountinue = By.xpath("//span[normalize-space()='Continue']");
	By ClickClinicSetup = By.xpath("//span[normalize-space()='Continue to Clinic Setup']");
	By AddClinicPicture = By.xpath("//input[@name='image']");
	By EnterClinicName = By.xpath("//input[@id='txtClinicName']");
	By EnterCityName = By.xpath("//input[@placeholder='Select a city']");
	By SelectCityDropdown = By.xpath("/html[1]/body[1]/app-root[1]/app-login-layout[1]/app-clinic-steps[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-clinic-information[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/p-autocomplete[1]/span[1]/div[1]/ul[1]/li[1]/span[1]");
	By SaveClinicDetails = By.xpath("//span[normalize-space()='Save & Continue']");
	By SaveSlotTime = By.xpath("/html[1]/body[1]/app-root[1]/app-login-layout[1]/app-clinic-steps[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-consultation-timing[1]/div[1]/div[10]/div[2]/button[1]/span[1]");
	By EnterConsultationFee = By.xpath("//input[@placeholder='Consultation fee']");
	By EnterFollowupFee = By.xpath("//input[@placeholder='Follow-up fee']");
	By EnterFollowupDays = By.xpath("//input[@placeholder='Days']");
	By SaveFeeDays = By.xpath("/html[1]/body[1]/app-root[1]/app-login-layout[1]/app-clinic-steps[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-fee[1]/div[1]/div[4]/div[2]/button[1]");
	By ClickToHomePage = By.xpath("/html[1]/body[1]/app-root[1]/app-login-layout[1]/app-clinic-success-setup[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/button[1]/span[1]");
	By ClickDoctorProfile = By.xpath("//div[@class='content_Selectbox_drName ng-star-inserted']");
	By ClickLogoutButton = By.xpath("//span[@class='p-button-label']");
	By ConfirmLogout = By.xpath("//span[normalize-space()='Yes']");
	
	public doctorOnboardingFlow(WebDriver driver) {

		this.driver = driver;

	}
	public void EnterDoctorMobileNo(String arg1)
	 
	{
		Random random = new Random();

		long tenDigitNumber = 1000000000L + (long) (random.nextDouble() * 9000000000L);

		driver.findElement(EnterDoctorMobileNo).sendKeys(String.valueOf(tenDigitNumber));

 
	}
	public void EnterDoctorEmail(String arg1)
	 
	{

		driver.findElement(EnterDoctorEmail).sendKeys(arg1);

 
	}
	public void EnterDoctorFirstName(String arg1)
	 
	{

		driver.findElement(EnterDoctorFirstName).sendKeys(arg1);

 
	}
	public void EnterDoctorLastName(String arg1)
	 
	{

		driver.findElement(EnterDoctorLastName).sendKeys(arg1);

 
	}
	public void EnterDoctorPassword(String arg1)
	 
	{

		driver.findElement(EnterDoctorPassword).sendKeys(arg1);

 
	}
	public void EnterDoctorRePassword(String arg1)
	 
	{

		driver.findElement(EnterDoctorRePassword).sendKeys(arg1);

 
	}
	public void ClickSignUp()
	 
	{
		WebElement element = driver.findElement(ClickSignUp);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

		//driver.findElement(ClickSignUp).click();

 
	}
	public void EnterOTP(String arg1)
	 
	{

		driver.findElement(EnterOTP).sendKeys(arg1);

 
	}
	public void ClickVerifyButton()
	 
	{

		driver.findElement(ClickVerifyButton).click();

 
	}
	public void ClickAddProfilePic(String arg1)
	 
	{

		driver.findElement(ClickAddProfilePic).sendKeys(arg1);

 
	}
	public void SelectGender()
	 
	{

		driver.findElement(SelectGender).click();

 
	}
	public void EnterQualification(String arg1)
	 
	{

		driver.findElement(EnterQualification).sendKeys(arg1);

 
	}
	public void ClickSpecialityDropdown()
	 
	{
		WebElement element = driver.findElement(ClickSpecialityDropdown);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

		//driver.findElement(ClickSpecialityDropdown).click();

 
	}
	public void SelectSpeciality()
	 
	{
		WebElement element = driver.findElement(SelectSpeciality);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

		//driver.findElement(SelectSpeciality).click();

 
	}
	public void ClickStateDropdown()
	 
	{
		WebElement element = driver.findElement(ClickStateDropdown);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

		//driver.findElement(ClickStateDropdown).click();

 
	}
	public void SelectState()
	 
	{

		driver.findElement(SelectState).click();

 
	}
	public void EnterRegistrationNo(String arg1)
	 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(EnterRegistrationNo));

		String randomString = UUID.randomUUID().toString().replace("-", "").substring(0, 10);
 
		element.sendKeys(randomString);

		

 
	}
	public void ClickCountinueButton()
	 
	{
		WebElement element = driver.findElement(ClickCountinueButton);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

		//driver.findElement(ClickCountinueButton).click();

 
	}
	public void EnterPromoCode(String arg1)
	 
	{

		driver.findElement(EnterPromoCode).sendKeys(arg1);

 
	}
	public void ClickApplyButton()
	 
	{

		driver.findElement(ClickApplyButton).click();

 
	}
	public void ClickAccountactiveCountinue()
	 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ClickAccountactiveCountinue));
		element.click();

	}
	public void ClickClinicSetup()
	 
	{
		WebElement element = driver.findElement(ClickClinicSetup);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

		//driver.findElement(ClickClinicSetup).click();
	}
	public void AddClinicPicture(String arg1)
	 
	{

		driver.findElement(AddClinicPicture).sendKeys(arg1);
	}
	public void EnterClinicName(String arg1)
	 
	{

		driver.findElement(EnterClinicName).sendKeys(arg1);
	}
	public void EnterCityName(String arg1)
	 
	{

		driver.findElement(EnterCityName).sendKeys(arg1);
	}
	
	public void SelectCityDropdown()
	 
	{
		WebElement element = driver.findElement(SelectCityDropdown);

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click();", element);

		//driver.findElement(SelectCityDropdown).click();
	}
	
	public void SaveClinicDetails()
	 
	{

		driver.findElement(SaveClinicDetails).click();
	}
	
	public void SaveSlotTime()
	 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(SaveSlotTime));
		

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

	}
	
	public void EnterConsultationFee(String arg1)
	 
	{

		driver.findElement(EnterConsultationFee).sendKeys(arg1);
	}
	
	public void EnterFollowupFee(String arg1)
	 
	{

		driver.findElement(EnterFollowupFee).sendKeys(arg1);
	}
	
	public void EnterFollowupDays(String arg1)
	 
	{

		driver.findElement(EnterFollowupDays).sendKeys(arg1);
	}
	
	public void SaveFeeDays()
	 
	{

		driver.findElement(SaveFeeDays).click();
	}
	public void ClickToHomePage()
	 
	{		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ClickToHomePage));
	

	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	element.click();

	}
	public void ClickDoctorProfile()
	 
	{

		driver.findElement(ClickDoctorProfile).click();
	}
	public void ClickLogoutButton()
	 
	{

		driver.findElement(ClickLogoutButton).click();
	}
	public void ConfirmLogout()
	 
	{

		driver.findElement(ConfirmLogout).click();
	}

}
