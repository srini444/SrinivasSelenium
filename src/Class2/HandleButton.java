package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HandleButton {
  WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new FirefoxDriver();
  }
  @Test
  public void f() throws InterruptedException
  {
	/*
	  //Image Button
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  driver.findElement(By.xpath("//input[@value='Login'] ")).click();
	*/
	//Non-Image Button
	  
	 driver.get("http://parabank.parasoft.com/parabank/index.htm");
	 driver.findElement(By.xpath("//input[@class='input']")).sendKeys("john");
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("demo"); 
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//input[@class='button']")).click();
	  
  }
  @AfterTest
  public void afterTest()
  {
	  //driver.close();
	  
  }

}
