package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day4 {

	@Test
	public void webHomelogin() 
	{
		System.out.println("LogedinHome");
		Assert.assertTrue(false);
	}
	
	@Test
	public void mobileHomeLogin() 
	{
		System.out.println("Home Failed");
	}
	
	@Test(groups = {"smoke"})
	public void LoginHomeAPI()
	{
	System.out.println("Home_APICAR");	
	}
}
