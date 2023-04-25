package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerclass implements ITestListener {

	public void onFinish(ITestContext context) {
		System.out.println("All the Testcases onfinish:"+context.getName());
	}

	public void	onStart(ITestContext context) {
		System.out.println("All the Testcases onStart:"+context.getName());
	}


	public void	onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		System.out.println("The Testcase methodlong:"+Result.getName());
	}

	public void	onTestFailure(ITestResult Result) {
		System.out.println("The Testcase onfailure:"+Result.getName());
	}

	public void	onTestSkipped(ITestResult Result) {
		System.out.println("The Testcase onskipped:"+Result.getName());
	}

	public void	onTestStart(ITestResult Result) {
		System.out.println("The Testcase onstart:"+Result.getName());
	}

	public void	onTestSuccess(ITestResult Result) {
		System.out.println("The Testcase onsuccess:"+Result.getName());
	}

	
	
}
