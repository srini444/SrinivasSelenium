package Class3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CrossBrowser {
  WebDriver driver; 
  @BeforeTest
  public void beforeTest() 
  {
	  
  }
  @Test
  @Parameters("browser")
  public void Test (String browser) 
  {
	  if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
			driver.get("http://localhost/helloSaarthitechnologies_new_theme_html/");
			
		}
	  
	  
	  else if(browser.equalsIgnoreCase("Chrome"))
	  {
		  driver = new ChromeDriver();
		  driver.get("http://localhost/helloSaarthitechnologies_new_theme_html/");
		  driver.manage().window().maximize();
	  }
		
	  
	  else if(browser.equalsIgnoreCase("IE"))
	  {
		  driver = new InternetExplorerDriver();
		  driver.get("http://localhost/helloSaarthitechnologies_new_theme_html/");
		  driver.manage().window().maximize();
	  }
	  
	  else
	  {
		  System.out.println("Browser is not correct");
	  }
	  
	  
  }
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
