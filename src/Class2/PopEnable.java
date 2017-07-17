package Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PopEnable {
  WebDriver driver; 
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new ChromeDriver();
	  
  }
  @Test
  public void f() 
  {
	driver.manage().window().maximize();
	driver.get("http://www.thehansindia.com/");
  }
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
