package Class2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
  public void f() throws IOException, InterruptedException 
  {
	driver.manage().window().maximize();
	driver.get("http://www.thehansindia.com/");
	Thread.sleep(5000);
	File scs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scs, new File("D:/srinivas.jpg"));
	
  }
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
