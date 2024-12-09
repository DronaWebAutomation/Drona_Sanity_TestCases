package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromConfigure {
	WebDriver driver;
	
    // Initialize WebDriver
	public  WebDriver dronachromsetup() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://52.136.36.205/uatweb/DrOnA/profile");
    driver.manage().window().maximize();
	return driver;

//     //Initialize ExtentTest for this context
//    test = reports.createTest(context.getName());
//    test.assignAuthor("Rahul Sharma");
//    test.assignDevice("Chrome");

    // Initialize other page objects
	

}
}

