package LoginFlow;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.Json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import LoginPage.loginFlowTest;

public class loginFlowMethod {
	 WebDriver driver;
	 loginFlowTest objLoginPage;

	 
//	public loginFlowMethod(WebDriver driver)
//	{
//		this.driver= driver;
//	}
	 
    public void Login(WebDriver driver) throws InterruptedException, IOException {
   	this.driver= driver;
   	 ObjectMapper objectMapper = new ObjectMapper();
   	 File file = new File("src/test/resources/testdata/logintestdata.json");
        JsonNode jsonData = objectMapper.readTree(file);
        // Access JSON data
        String testusername = jsonData.get("validLogin").get("docusername").toString();
        String testpassword = jsonData.get("validLogin").get("docpassword").toString();
    
    objLoginPage = new loginFlowTest(driver);
    Thread.sleep(1000);
    objLoginPage.username(testusername);
    Thread.sleep(1000);
    objLoginPage.continueBtn();
    Thread.sleep(1000);
    objLoginPage.password(testpassword);
    Thread.sleep(1000);
    objLoginPage.loginBtn();

}

}
