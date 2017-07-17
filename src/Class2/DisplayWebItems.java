package Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DisplayWebItems {
	WebDriver driver;
  @BeforeTest
  public void beforeTest()
  {
	  driver = new FirefoxDriver();
  }
  @Test
  public void f() 
  {
	  // Launch URL
	  driver.get("https://www.hellosaarthi.com/");
	  // Current URL
	  System.out.println(driver.getCurrentUrl());
	  // WindowHandle
	  System.out.println(driver.getWindowHandle());
	  // Page Title
	  System.out.println(driver.getTitle());
	  // Page Source Code
	  System.out.println(driver.getPageSource());
	  
  }
  @AfterTest
  public void afterTest()
  {
	  
  }

}
