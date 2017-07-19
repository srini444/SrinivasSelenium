package Class1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	 driver = new FirefoxDriver(); 
  }
  @Test
  public void f() 
  {
	  //driver.get("http://newtours.demoaut.com/mercurysignon.php");
	  driver.get("https://www.google.co.in");
	  String actualTitle = driver.getTitle();
      System.out.println("ActualTitle is " + actualTitle );
           
      //driver.findElement(By.xpath("//a[@class='gb_P'] ")).click();
      //driver.findElement(By.xpath("//input[@name='login'] ")).click();
      //driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
      
      
  }
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
