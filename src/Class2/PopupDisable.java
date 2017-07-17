package Class2;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PopupDisable {
  WebDriver driver;
	@Test
  public void f() 
  {
	//Create prefs map to store all preferences 
	  Map<String, Object> prefs = new HashMap<String, Object>();

	  //Put this into prefs map to switch off browser notification
	  prefs.put("profile.default_content_setting_values.notifications", 2);

	  //Create chrome options to set this prefs
	  ChromeOptions options = new ChromeOptions();
	  options.setExperimentalOption("prefs", prefs);

	  //Now initialize chrome driver with chrome options which will switch off this browser notification on the chrome browser
	  WebDriver driver = new ChromeDriver(options);

	  //Now do your further steps
	  driver.get("http://www.thehansindia.com/");	    
	
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
