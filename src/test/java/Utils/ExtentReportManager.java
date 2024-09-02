package Utils;

//import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import PageFactory.BaseClass;

public class ExtentReportManager implements ITestListener // or TestListenerAdapter class
{
	public ExtentSparkReporter sparkReporter; // UI of the report
	public ExtentReports extent; // populate common info on the report
	public ExtentTest test;
	BaseClass base = new BaseClass();// creating test case entries in the report and update status of the test
										// methods

	public void onStart(ITestContext context) {
		sparkReporter = new ExtentSparkReporter("C:\\Users\\2303783\\git\\repository3\\MyCareerApp\\TestNGReports");// specify
																														// location
																	// of
																														// the
																														// report
		sparkReporter.config().setDocumentTitle("Automation Report"); // TiTle of report
		sparkReporter.config().setReportName("MyCareerApp"); // name of the report
		sparkReporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Bindu Madhavi");
		extent.setSystemInfo("os", "Windows11");
		extent.setSystemInfo("Browser name", "Chrome,Edge");
	}

	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName()); // create a new entry in the report
		test.log(Status.PASS, "TEST CASE PASSED IS  :" + result.getName()); // update status p/f/s
		try {
			String screenshotpath = base.TakeScreenshot(result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case FAILED is:" + result.getName());
		test.log(Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable());
		try {
			String screenshotpath = base.TakeScreenshot(result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case SKIPPED is:" + result.getName());
		try {
			String screenshotpath = base.TakeScreenshot(result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
