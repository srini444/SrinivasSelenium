package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Hellosaarthitechnologies {
  WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new FirefoxDriver();
  }
  @Test
  public void f() 
  {
	  driver.get("http://hellosaarthitechnologies.com");
	  driver.findElement(By.xpath("html/body/header/div/div/ul/li[2]/a")).click();
  }
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
