package Class3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FileUplad {
  WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new FirefoxDriver();
  }
  @Test
  public void f() throws InterruptedException, IOException 
  {
	 /* driver.get("http://www.niittrainercentral.com/UserRegistration.aspx");
	  driver.findElement(By.name("ctl00$ctl00$ContentPlaceHolder1$ContentPlaceHolder3$txtTitle")).sendKeys("Tester");
	  driver.findElement(By.name("ctl00$ctl00$ContentPlaceHolder1$ContentPlaceHolder3$fileUploadResume")).click();
	 */
	  driver.get("http://imgur.com/upload");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='upload-modal']/div[2]/div[2]/label")).click();
	  Thread.sleep(3000);
	    // below line execute the AutoIT script .
	     Runtime.getRuntime().exec("E:\\File1.exe");
	     
  }
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
