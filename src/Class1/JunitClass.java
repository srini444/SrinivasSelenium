package Class1;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JunitClass {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception 
	{
		driver = new FirefoxDriver();
	}
	@Test
	public void test() 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}


}
