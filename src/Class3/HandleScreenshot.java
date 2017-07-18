package Class3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HandleScreenshot 
{
  WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new FirefoxDriver();
	  
  }
  @Test
  public void f() 
  {
	  
  }
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
