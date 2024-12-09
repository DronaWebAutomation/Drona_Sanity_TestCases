package LoginPage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
public class loginFlowTest {
 
 
	WebDriver driver;
 
	By username = By.xpath("//*[@formcontrolname='userName']");


	By continueBtn = By.xpath("//*[@class=\"elem-width-v2 drona-Primary_v2 p-button p-component\"]");

	By password = By.xpath("//*[@formcontrolname=\"otpValidat\"]");

	By OneLoginBtn = By.xpath("//*[@class=\"p-button-label\"]");

	public loginFlowTest(WebDriver driver) {

		this.driver = driver;

	}
 
	public void username(String arg1) {

		driver.findElement(username).sendKeys(arg1);
 
	}
 
	public void continueBtn() {

		driver.findElement(continueBtn).click();
 
	}
 
	public void password(String arg1) {

		driver.findElement(password).sendKeys(arg1);

	}
 
	public void loginBtn()
 
	{

		driver.findElement(OneLoginBtn).click();

	}
 
}

 