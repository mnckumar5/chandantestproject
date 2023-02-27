package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener

{
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed" + result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed" + result.getMethod().getMethodName());
		System.out.println("Exception throwable by this method" + result.getThrowable().getMessage());
	}

}
