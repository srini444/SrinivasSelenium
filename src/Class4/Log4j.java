package Class4;
 

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
	public class Log4j {
	 static WebDriver driver;
	 static Logger Log = Logger.getLogger(Log4j.class.getName());
 
	 @Test
		public void test() throws Exception {
			
		DOMConfigurator.configure("log4j.xml");
 
        driver = new FirefoxDriver();
 
        Log.info("New driver launched");
 
        driver.get("http://newtours.demoaut.com/");
 
        Log.info("Web application launched");
 
        driver.findElement(By.name("userName")).sendKeys("mercury");
 
        Log.info("Username entered");
 
        driver.findElement(By.name("password")).sendKeys("mercury");
 
        Log.info("Password entered");
 
        driver.findElement(By.name("login")).click();
 
        Log.info("Clicked on Sign-In button");
              
 
	}
 
}