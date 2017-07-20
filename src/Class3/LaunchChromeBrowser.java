package Class3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LaunchChromeBrowser 
{
  WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	  //System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  //driver = new FirefoxDriver();
  }
  @Test
  public void f() 
  {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.co.in/");
	  	  
  }
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
