package BasicLearning_TestNG;
import org.testng.annotations.*;

public class TestNGannotations {
	
	@BeforeSuite
	public void beforeSuit () {
		System.out.println(" before Suit......");
	}
	
	@AfterSuite
	public void afterSuit () {
		System.out.println("after Suit......");
	}
	
	@BeforeTest
	public void beforetestt () {
		System.out.println("before test......");
	}
	
	@AfterTest
	public void aftertestt () {
		System.out.println("after test......");
	}
	
	
	@BeforeClass
	public void beforeclasss () {
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
	
	@BeforeMethod
	public void beforemethodd() {
		System.out.println("before method");
	}
	
	@AfterMethod
	
	public void aftermethodd() {
		System.out.println("after method  .........\n");
	}
	
	@Test
	public void testcase1 () {
		
		System.out.println("this is test1");
	}
	
	@Test
	public void testcase2() {
		System.out.println("this is test");
	}
	
}
