package Class2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HandleDropdownBox {
  WebDriver driver;
  @BeforeTest
  public void beforeTest()
  {
	  driver = new FirefoxDriver();
	  
  }
  @Test
  public void f() throws InterruptedException 
  {
	  driver.get("http://newtours.demoaut.com");
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  driver.findElement(By.name("login")).click();
	  
	  Thread.sleep(5000);
	  Select dw = new Select(driver.findElement(By.name("passCount")));
	  //dw.selectByVisibleText("2");
	  //dw.selectByIndex(2);
	  dw.selectByVisibleText("3");
	
	  //Dropdown items count
	  List<WebElement> sum = dw.getOptions();
	  int dcount = sum.size();
	  System.out.println(dcount);
	  
	  for(int i=0; i<dcount; i++) 
	  {
		  System.out.println(sum.get(i).getText());
	  }
  }
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
