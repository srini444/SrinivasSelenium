package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNg 
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
	driver.get("https://www.google.co.in");  
  }
 
  @AfterTest
  public void afterTest() 
  {
	driver.close();  
  }

}
