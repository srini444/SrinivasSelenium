package Class3;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
public class BaseClass {
	WebDriver driver;
	
  @BeforeMethod
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  driver.get("http://newtours.demoaut.com/");
	 
  }

  @AfterMethod
  public void afterClass() {
	  driver.close();
  }

}
