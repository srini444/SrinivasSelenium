package Class3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AlphabeticalTestExecution {

	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		
		driver = new FirefoxDriver();
	}

	@Test
	public void testB() {
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test
	public void testA() {
		driver.get("http://store.demoqa.com/");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test
	public void testC() {
		driver.get("http://parabank.parasoft.com/parabank/index.htm");
		System.out.println(driver.getCurrentUrl());
	}

	
	@AfterTest
	public void tearDown() throws Exception {
	}


}
