package Session_46_Listners_Extent_Reports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener  {
    //We can implement lister class either by
    // by implementing ITestListener or by extends TestListnerAdaptar

    public void onTestStart(ITestResult result) {
        System.out.println("for test methods started...");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("For passed.....");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed...");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped...");
    }


    public void onStart(ITestContext context) {
        System.out.println("test execution is started...");
    }
    public void onFinish(ITestContext context) {
        System.out.println("execution is completed....");
    }


}
