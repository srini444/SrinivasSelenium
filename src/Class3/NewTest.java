package Class3;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() 
  {
	  
	  driver =new FirefoxDriver();
	  System.out.println("Launch Browser");
  }

  @Test
  public void test() throws InterruptedException 
  {
	  driver.get("http://localhost/hellosaarthi_new_theme/");
	  System.out.println("Launch Web Site");
	  Thread.sleep(3000);
  }
  
  
  @AfterMethod
  public void afterMethod() throws InterruptedException 
  {
	  Thread.sleep(3000);
	  driver.quit();
	  System.out.println("Launch Close");
  }

}
