package Class3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestSuiteTest1 {

	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		
		driver = new FirefoxDriver();
	}

	@Test
	public void test() {
		driver.get("http://localhost/hellosaarthi_new_theme/");
	}

	
	@AfterTest
	public void tearDown() throws Exception {
	}


}
