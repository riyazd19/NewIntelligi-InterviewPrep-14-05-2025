package Session_46_Listners_Extent_Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class ExtentReportManager implements ITestListener {

    //below three are mainly three classes
    public ExtentSparkReporter sparkReporter;//responsible UI of report dark/light look and feel alignment
    public ExtentReports extent;//populating some common details username,browser and all
    public ExtentTest test;//creating test entries update status

    public void onStart(ITestContext context) {
        String timestamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
        String reportPath = System.getProperty("user.dir") + "/reports/ExtentReport_" + timestamp + ".html";
        sparkReporter = new ExtentSparkReporter(reportPath);
        //sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myReports.html");
        sparkReporter.config().setDocumentTitle("AutomationReport");
        sparkReporter.config().setReportName("Functional Testing");
        sparkReporter.config().setTheme(Theme.DARK);
        System.out.println("Test execution is started...");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("compname", "local host");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("For passed.....");
        test = extent.createTest(result.getName());
        test.log(Status.PASS, "test case is passed: " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.FAIL, "test id failes: " + result.getName());
        test.log(Status.FAIL, "Test case failed cause is: " + result.getThrowable());
        System.out.println("Test failed...");
    }

    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.SKIP, "test is skipped: " + result.getName());
        System.out.println("Test skipped...");
    }

    public void onFinish(ITestContext context) {
        extent.flush();
        System.out.println("execution is completed....");
    }

}
