package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute at the end");
	}
	
	@Test(timeOut=4000)
	public void Demo() 
	{
		System.out.println("Hi");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I am the number 1 from last");
	}
	
	@Test
	public void Demo2()
	{
		System.out.println("Good1Bye!!!");
	}

}
