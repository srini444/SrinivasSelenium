package Class3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PrioritizedTestExecution {

	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		
		driver = new FirefoxDriver();
		
	}

	@Test (priority = 3)
	public void logout() {
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}
	
	@Test (priority = 2)
	public void flightreservation() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("reserveFlights")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("buyFlights")).click();
	}
	
	@Test (priority = 1)
	public void login() throws Exception {
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
	}
	

	@AfterTest
	public void tearDown() throws Exception {
	}


}
