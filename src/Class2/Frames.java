package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Frames {
   WebDriver driver;
	@BeforeTest
  public void beforeTest() {
  }
    @Test
    public void f() throws InterruptedException 
    {
  	  driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");

  		//Switch to classFrame(right pane)
  		driver.switchTo().frame("classFrame");
  		
  		//Click on com.thoughtworks.selenium link
  		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
  		
  		driver.switchTo().defaultContent();
  				
  		//Switch to packageFrame(left down pane)
  		driver.switchTo().frame("packageFrame");
  				
  		Thread.sleep(2000);
  		
  		//Click on AbstractAnnotations link
  		driver.findElement(By.linkText("AbstractAnnotations")).click();
  				  
    }

  @AfterTest
  public void afterTest() {
  }

}
