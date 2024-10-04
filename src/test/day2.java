package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


public class day2 {
	
	@Test(groups= {"smoke"})
	public void ploan() 
	{
		System.out.println("Great");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("I will execute first");
	}

}
