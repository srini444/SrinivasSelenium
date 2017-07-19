package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in");
		

	}

}
