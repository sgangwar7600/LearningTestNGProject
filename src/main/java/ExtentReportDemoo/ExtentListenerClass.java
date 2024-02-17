package ExtentReportDemoo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListenerClass implements ITestListener {
	
	ExtentSparkReporter htmlRepoter;
	ExtentReports reports;
	ExtentTest test;
	
	
	public void configureReport() {
		
		htmlRepoter = new ExtentSparkReporter("ExtentListenerReportDemoAgain.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlRepoter);
		
		//add system information/environment info to reports
		
		reports.setSystemInfo("Machine", "testpc1");
		reports.setSystemInfo("OS", "window 11");
		reports.setSystemInfo("browser:", "chrome");
		reports.setSystemInfo("user name:", "Prachi");
		
		
		//configuration to change look and feel of report
		htmlRepoter.config().setDocumentTitle("Extent Listener Report Demo");
		htmlRepoter.config().setReportName("This is first report");
		htmlRepoter.config().setTheme(Theme.DARK);
		htmlRepoter.config().setTimeStampFormat("EEEE, MMMM dd , yyyy , hh:mm a '('zzz')'");

	}
	
		public void onStart(ITestContext Result) {
		
		configureReport();
		
		System.out.println("On Start method invoked....");
	}
	
	public void onFinish(ITestContext Result) {
		System.out.println("On Finished method invoked....");
		reports.flush();
	}
	
	//when test case get failed, this method is called
	public void onTestFailure(ITestResult Result) {
		System.out.println("Name of test method failed : " + Result.getName() );
		test = reports.createTest(Result.getName());
}
	
	//when test case get skipped, this method is called
	public void onTestSkipped(ITestResult Result) {
		System.out.println("Name of test method skipped : " + Result.getName() );
		test = reports.createTest(Result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the Skip test case is :" + Result.getName(), ExtentColor.YELLOW));
	}
	
	//when test case get started , this method is called
	public void onTestStart(ITestResult Result) {
		System.out.println("Name of test method started : " + Result.getName() );
	}
	
	//when test case get passed, this method is called
	public void onTestSuccess(ITestResult Result) {
		System.out.println("Name of test method sucessfully executed : " + Result.getName());
		test = reports.createTest(Result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of the pass test case is :" + Result.getName(), ExtentColor.GREEN));
	
	}
	
	public void onTestFailedButWithInSuccessPercentage(ITestResult Result) {
		
	}
}
