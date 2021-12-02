package APITEST;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestng2 {

	
	
	@BeforeClass
	public void bc()
	{
		System.out.println("This is going to execute before class");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("This is going to execute before evey test");
	}
	
	@Test
	public void testcase3()
	{
		System.out.println("this is the third test case");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("This is going to execute after the suite");
	}
	
	@AfterSuite
	public void as()
	{
		System.out.println("This is going to execute after all the test");
	}
	
}