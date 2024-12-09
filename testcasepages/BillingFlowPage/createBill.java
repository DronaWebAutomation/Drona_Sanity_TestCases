package BillingFlowPage;
	 
	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


	 
	public class createBill {

		WebDriver driver;
	 
		By Bill_3dot_click = By.xpath("//td[@class='ng-star-inserted']//img[@class='img-fluid pointer']");

		By Click_create_bill = By.xpath("//span[normalize-space()='Create Bill']");

		By click_add_item = By.xpath("/html[1]/body[1]/app-root[1]/app-master-side-menu[1]/ng-sidebar-container[1]/div[1]/div[1]/div[1]/app-home[1]/div[1]/app-set-up-clinic-timings[1]/div[1]/div[10]/p-dialog[1]/div[1]/div[1]/div[2]/app-new-bill-popup[1]/div[1]/div[2]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/p-dropdown[1]/div[1]/div[2]");
	

		By select_item = By.xpath("//body[1]/div[2]/div[2]/ul[1]/p-dropdownitem[1]/li[1]");

		By add_paid_amount = By.xpath("//body[1]/app-root[1]/app-master-side-menu[1]/ng-sidebar-container[1]/div[1]/div[1]/div[1]/app-home[1]/div[1]/app-set-up-clinic-timings[1]/div[1]/div[10]/p-dialog[1]/div[1]/div[1]/div[2]/app-new-bill-popup[1]/div[1]/div[2]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/input[1]");

		By click_markpaid = By.xpath("//button[normalize-space()='Mark as Paid']");

		By click_whatsapp = By.xpath("//img[@alt='whatsapp']");

		By click_cross_icon = By.xpath("//span[@class='p-dialog-header-close-icon ng-tns-c133-20 pi pi-times']");
	 
		public createBill(WebDriver driver) {

			this.driver = driver;

		}
	 
		public void Bill_3dot_click() {

			driver.findElement(Bill_3dot_click).click();
	 
		}
	 
		public void Click_create_bill() {

			driver.findElement(Click_create_bill).click();
	 
		}
	 
		public void click_add_item() {
//			WebElement element = driver.findElement(click_add_item);
//			JavascriptExecutor executor = (JavascriptExecutor)driver;
//			executor.executeScript("arguments[0].click();", element);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(click_add_item));

			
			element.click();

		}
	 
		public void select_item()
	 
		{
			WebElement calendar = driver.findElement(select_item);  // Replace with actual ID or selector
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", calendar);

			//driver.findElement(select_item).click();

		}

		public void add_paid_amount (String arg1)
	 
		{

			driver.findElement(add_paid_amount).sendKeys(arg1);

		}

		public void click_markpaid()
	 
		{

			driver.findElement(click_markpaid).click();

		}

		public void click_whatsapp ()
	 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(click_whatsapp));

			//driver.findElement(click_whatsapp).click();

		}

		public void click_cross_icon()
	 
		{

			driver.findElement(click_cross_icon).click();

		}
	}