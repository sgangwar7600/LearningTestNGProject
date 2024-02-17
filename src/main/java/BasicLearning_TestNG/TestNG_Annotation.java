package BasicLearning_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_Annotation {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("This is for Before Suite Annotation");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("This is for Before test Annotation");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("This is for Before class Annotation");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("This is for Before method Annotation");
	}
	
	
	@Test
	public void logintest() {
		System.out.println("This is a test case");
	}
	
	@Test
	public void regtest()  {
		System.out.println("this is registration test");
	}
	
	
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("This is for after  method Annotation");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("This is for after class Annotation");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("This is for aftertest Annotation");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is after suite Annotation");
	}
	
}
