package Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CloseBrowser {
  WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	driver = new FirefoxDriver();  
  }
  @Test
  public void f() 
  {
	  driver.get("http://localhost/hellosaarthi_new_theme/");
  }
  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
