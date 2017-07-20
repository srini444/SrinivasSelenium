package Class3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SingleTestExecution {

	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		
		driver = new FirefoxDriver();
	}

	@Test
	public void test() {
		driver.get("http://newtours.demoaut.com/");
	}

	
	@AfterTest
	public void tearDown() throws Exception {
	}


}
