package com.searchEng;
import org.testng.ITestResult;

public class TestReporter {
	
	    public void onTestStart(ITestResult result) {
	        Log.debug("\tStarted " + result.getName());
	       
	    }
	    
	    public void onTestSuccess(ITestResult result) {
	        String executionTime = "(" + String.valueOf((result.getEndMillis() - result.getStartMillis()) / 1000.0) + " seconds)";
	        Log.info("\tTest (priority "+result.getMethod().getPriority()+") : " + result.getName() + " PASSED. " + executionTime);

	    }
	    
	    public void onTestFailure(ITestResult result) {
	    	Log.error("\tTest : " + result.getName() + " FAILED.\n\t" );
	    }
	    
	    public void onTestSkipped(ITestResult result) {
	    	Log.info("\tTest: " + result.getName() + " SKIPPED.");
	    }

}
