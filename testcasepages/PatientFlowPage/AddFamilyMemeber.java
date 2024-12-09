package PatientFlowPage;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;


public class AddFamilyMemeber {
	
	WebDriver driver;
	 
 
	By SelectAddfamily = By.xpath("//div[@class='dropdown-menu dropdown-margin show']//span[contains(text(),'Add Family Members')]");

	By ClickTitleField = By.xpath("//span[@class='p-dropdown-trigger-icon ng-tns-c71-119 pi pi-chevron-down']");

	By SelectTitle = By.xpath("//li[@aria-label='Mr.']");

	By AddFamilyMemberName = By.xpath("//div[@class='p-col-4 mt10']//input[@id='txtClinicName']");

	By ClickRelationDropdown = By.xpath("//span[@class='ng-tns-c71-120 p-dropdown-label p-inputtext ng-star-inserted']");

	By SelectRelation = By.xpath("//li[@aria-label='Father']");

	By FamilyMemberAge = By.xpath("//input[@id='txtCity']");
	By AddFamilyMemeberButton = By.xpath("//span[@class='p-button-label'][normalize-space()='Add Family Member']");
	
	
	public AddFamilyMemeber(WebDriver driver) {

		this.driver = driver;

	}
 
	public void SelectAddfamily() {

		driver.findElement(SelectAddfamily).click();
 
	}
 
	public void ClickTitleField() {

		WebElement element = driver.findElement(ClickTitleField);

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click();", element);

	}
 
	public void SelectTitle()
 
	{

		driver.findElement(SelectTitle).click();

	}
 
	public void AddFamilyMemberName(String arg1)
 
	{
 
		driver.findElement(AddFamilyMemberName).sendKeys(arg1);
 
	}
	public void ClickRelationDropdown()
	 
	{

		driver.findElement(ClickRelationDropdown).click();

	}
	
	public void SelectRelation()
	 
	{

		driver.findElement(SelectRelation).click();

	}
 
	public void FamilyMemberAge(String arg1)
 
	{

		driver.findElement(FamilyMemberAge).sendKeys(arg1);

 
	}
 
	public void AddFamilyMemeberButton()
 
	{

		driver.findElement(AddFamilyMemeberButton).click();

	}

//	public void backarrowicon()
// 
//	{
//
//		WebElement element = driver.findElement(backarrowicon);
//
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//
//		executor.executeScript("arguments[0].click();", element);
//
//		//driver.findElement(backarrowicon).click();
//
//	}
// 
 



}
