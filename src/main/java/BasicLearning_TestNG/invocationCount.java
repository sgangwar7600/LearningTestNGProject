package BasicLearning_TestNG;
import org.testng.ITestContext;
import org.testng.annotations.*;


public class invocationCount {

	
	@Test(invocationCount = 5)
	public void testMethod1(ITestContext context) {
		
		int currentinvocationCount = context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("Executing: " + currentinvocationCount );
		System.out.println("Test method1 ..........................");
	}
	
	@Test(invocationCount = 3)
	public void testMethod2(ITestContext context) {
		
		int currentinvocationCount1 = context.getAllTestMethods()[1].getCurrentInvocationCount();

		System.out.println("Executing: "  + currentinvocationCount1 );
		System.out.println("Test method2 ..........................");

	}
	
}
