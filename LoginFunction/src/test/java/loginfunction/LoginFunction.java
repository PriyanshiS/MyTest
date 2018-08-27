package loginfunction;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginFunction {
	WebDriver driver;
	String baseURL;
	
	  @Test
	  public void Expedia_login() throws InterruptedException {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Priyanshi\\Documents\\Priyanshi_Projects\\Acquirer_Portal\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  baseURL = "https://www.expedia.ca/";
		  driver.get(baseURL);
		  Thread.sleep(3000);
		  }	
	  
  @AfterTest
  public void afterTest() {
	 driver.quit();
  }
}
