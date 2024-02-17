package BasicLearning_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class ListenerClasss implements ITestListener  {

	public void onStartt(ITestContext Result) {
		
		System.out.println("on start method invoked................................");
	}
	
	public void onFinish(ITestContext Result) {
	
		System.out.println("on finished method invoked................................");

	}
	
	public void onTestFailure(ITestContext Result) {
		
		System.out.println("Name of test method failed "  +  Result.getName());

	}
	
	//When Test case get skipped , this method is called onTestSkipped
	public void onTestSkipped(ITestContext Result) {
		
		System.out.println("Name of test method skipped "  +  Result.getName());

	}

	//when test case get started, this method is called onTestStart
	public void onTestStart(ITestContext Result) {
		
		System.out.println("Name of test method started "  +  Result.getName());

	}
	
	//When test case get passed, this method is called 'ontestsuccess'
	
	public void onTestSuccess(ITestContext Result) {
		
		System.out.println("Name of test method successfully executed "  +  Result.getName());

	}
	
	public void onTestFailedButWithinSuccessPercentage() {
		
	}

	
}
