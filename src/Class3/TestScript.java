package Class3;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript extends BaseClass {
  @Test
  public void login1() {
	  
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  driver.findElement(By.name("login")).click();
  }
  
  @Test
  public void login2() {
	  
	  driver.findElement(By.name("userName")).sendKeys("mercur");
	  driver.findElement(By.name("password")).sendKeys("mercur");
	  driver.findElement(By.name("login")).click();
  }
}
