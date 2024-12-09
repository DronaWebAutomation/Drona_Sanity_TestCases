package Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {
	public static String captureScreenshot(WebDriver driver, String testName) {
        try {
            // Capture screenshot
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String filePath = "src/../Screenshot/" + System.currentTimeMillis()
    	    + ".png";

            // Save screenshot
            File destFile = new File(filePath);
            FileUtils.copyFile(scrFile, destFile);

            return filePath;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}


