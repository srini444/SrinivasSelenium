package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HelloSaarthiWebSite {
  WebDriver driver; 
  @BeforeTest
  public void beforeTest() 
  {
	driver = new FirefoxDriver();
	
  }
  @Test
  public void f() throws InterruptedException 
  {
	  driver.get("http://localhost/helloSaarthitechnologies_new_theme_html/index.html");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/div[2]/div[1]/div[2]")).click();
	  
  }
  @AfterTest
  public void afterTest() 
  {
	  
  }
  
}
