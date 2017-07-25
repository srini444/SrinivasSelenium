package Class3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
public class BaseClass1 {

  WebDriver driver;
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver = new FirefoxDriver();
	  driver.get("http://localhost/helloSaarthitechnologies_new_theme_html/index.html");
  }
 
  @AfterMethod
  public void afterMethod() throws InterruptedException 
  {
	  Thread.sleep(5000);
	  driver.close();
  }

}
