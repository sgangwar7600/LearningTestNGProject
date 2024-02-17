package ExtentReportDemo;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class BasicExtentReportClass {

	ExtentSparkReporter htmlRepoter;
	ExtentReports reports;
	ExtentTest test;

	@BeforeTest
	public void startReport() {

		//htmlReporter = new ExtentSparkReporter("ExtentReportDemo.html");
		htmlRepoter = new ExtentSparkReporter("ExtentReportDemo.html");

		reports = new ExtentReports();
		reports.attachReporter(htmlRepoter);

		//add environment details

		reports.setSystemInfo("Machine" , "estpc1");
		reports.setSystemInfo("OS" , "window 11");
		reports.setSystemInfo("user" , "Prachi");
		reports.setSystemInfo("Browser" , "chrome");


		//configuration to change look and feel
		htmlRepoter.config().setDocumentTitle("Extent Report Demo");
		htmlRepoter.config().setReportName("Test Report");
		htmlRepoter.config().setTheme(Theme.STANDARD);
		htmlRepoter.config().setTimeStampFormat("EEEE, MMMM dd , yyyy , hh:mm a '('zzz')'");

	}
	@Test
	public void LaunchBrowserAndopenURL( ) {

		//create test
		test = reports.createTest("Launch browser and open URL");
		Assert.assertTrue(true);  //test passed
	}

	@Test
	public void VerifyTitle() {

		//create test
		test = reports.createTest("VerifyTitle");
		Assert.assertTrue(false);  //test failed

	}
	@Test
	public void VerifyLogo() {

		//create test
		test = reports.createTest("VerifyLogo");
		Assert.assertTrue(true);  //test true

	}

	@Test
	public void VerifyEmail() {

		//create test
		test = reports.createTest("VerifyEmail");

		throw new SkipException("skipping this test case with exception");
	}

	@Test
	public void VerifyUsername() {

		//create test
		test = reports.createTest("VerifyUsername");
		Assert.assertTrue(true);  //test true
	}

	@AfterTest
	public void getResult(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "FAILED", ExtentColor.RED));
			test.fail(result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "PASSED", ExtentColor.GREEN));
		}
		else if(result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "SKIPPED", ExtentColor.YELLOW));
		}
	}

	@AfterTest
	public void teardown() {

		reports.flush();
	}
}
























