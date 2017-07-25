package Class3;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript1 extends BaseClass1{
  @Test
  public void Login1() throws InterruptedException 
  {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/div[2]/div[1]/div[2]")).click();
	  
  }
  
  @Test
  public void Login2() throws InterruptedException 
  {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/div[2]/div[1]/div[3]")).click();
	  
  }
  
}
