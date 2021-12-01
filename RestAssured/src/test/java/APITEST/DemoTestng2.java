package APITEST;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DemoTestng2 {


@BeforeClass
public void BC()
{
	  System.out.println("This is my second Class");
}
	  
 @BeforeMethod
 public void BM()
{
	 System.out.println("This is before method");
}
 
}