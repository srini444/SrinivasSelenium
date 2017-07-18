package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Way2Sms {
  WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new FirefoxDriver();
  }
  @Test
  public void f() throws InterruptedException 
  {
	  driver.get("http://site21.way2sms.com/entry?ec=0080&id=0.22633332955517949");
	  Thread.sleep(3000);
	  driver.findElement(By.name("username")).sendKeys("XXXXXXXXX");
	  Thread.sleep(3000);
	  driver.findElement(By.name("password")).sendKeys("XXXXX");
	  Thread.sleep(3000);
	  driver.findElement(By.id("loginBTN")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath(".//*[@id='sendSMS']/a")).click();
	  Thread.sleep(3000);
	  driver.switchTo().frame("frame");
	  driver.findElement(By.xpath(".//*[@id='mobile']")).sendKeys("XXXXX");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath(".//*[@id='sndSMSSection']/div/div[2]/div[1]/div[2]")).click();
	  Thread.sleep(3000);
	  Select dw = new Select(driver.findElement(By.id("showingCat")));
	  dw.selectByVisibleText("Independence Day");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath(".//*[@id='smsGreetsPaging']/ol/li[6]")).click();
  }
  @AfterTest
  public void afterTest() {
  }

}
