package BillingFlowPage;


	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	 
	public class billCreateMarkAsPaid {

		WebDriver driver;
	 
		By click_markaspaid = By.xpath("//label[normalize-space()='Mark as Paid']");

		By enter_paid_amount = By.xpath("//input[@formcontrolname='paidAmt']");

		By click_save_button = By.xpath("//button[normalize-space()='Save']");

		By click_cross_icon = By.xpath("//div[@class='mark-cross-icon pointer']//*[name()='svg']");
	 
		public billCreateMarkAsPaid(WebDriver driver) {

			this.driver = driver;

		}
	 
		public void click_markaspaid() {

			driver.findElement(click_markaspaid).click();
	 
		}
	 
		public void enter_paid_amount(String arg1) {

			driver.findElement(enter_paid_amount).sendKeys(arg1);
	 
		}
	 
		public void click_save_button() {

			driver.findElement(click_save_button).click();

		}
	 
		public void click_cross_icon()
	 
		{

			driver.findElement(click_cross_icon).click();

		}

	 
	}
