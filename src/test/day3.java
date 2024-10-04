package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class day3 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before executing any method in class");
	}

	@Parameters({ "URL" })
	@Test
    public void webCarlogin(@Optional("http://defaulturl.com") String urlname) {
		System.out.println("Car Logedin");
		System.out.println(urlname);
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("I am running before every test in day 3 method");
	}

	@Test(groups = { "smoke" })
	public void mobileCarLogin() {
		System.out.println("Car longin Failed");
	}

	@BeforeSuite
	public void bfSuite() {
		System.out.println("I am number 1");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Executing after all methods are done");
	}

	@Test
	public void mobileCarLogout() {
		System.out.println("Car signedOut");
	}

	@Test(enabled = false)
	public void mobileCarsignin() {
		System.out.println("Car signedin");
	}

	@Test(dependsOnMethods = { "webCarlogin" })
	public void LoginCarAPI() {
		System.out.println("Login APICAR");
	}
}
