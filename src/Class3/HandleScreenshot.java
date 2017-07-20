package Class3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HandleScreenshot 
{
  WebDriver driver;
  
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new FirefoxDriver();
	  
  }
  @Test
  public void f() throws InterruptedException, IOException 
  {
	  driver.get("https://trumpexcel.com/subcategory-in-drop-down-list-excel/");
	  Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	  	File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("E:/myfile.jpg"));
		
	
  }
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
