package ExtentReportDemoo;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCaseExamplee {

	@Test
	public void testMethod1() {
		System.out.println("This is test method1.......");
		Assert.assertTrue(true); //pass
	}
	
	@Test
	public void testMethod2() {
		System.out.println("This is test method2.......");
		Assert.assertTrue(false); //fail
	}
	
	@Test
	public void testMethod3() {
		System.out.println("This is test method3.......");
		Assert.assertTrue(false); //fail
	}
	
	@Test
	public void testMethod4() {
		System.out.println("This is test method4.......");
		Assert.assertTrue(true); //pass
	}
	
	@Test
	public void testMethod5() {
		System.out.println("This is test method5.......");
		throw new SkipException("This test method is skip.....");
	}
}
