package Class3;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class SkipTestExecution {
	
	
	/*
	@BeforeTest()
	public void testskip1(){
		System.out.println("Skip1");
	}
	
	@Test(enabled=false)
	public void testCaseEnabling(){
			System.out.println("I'm Not Ready, please don't execute me");
		}
	
	@AfterTest()
	public void testskip2(){
		System.out.println("Skip2");
	}
	*/
	
	
	@Test
	public void testCaseSkipException(){
		System.out.println("Skip3");
			throw new SkipException("Skipping this exception");
		}
	 

}