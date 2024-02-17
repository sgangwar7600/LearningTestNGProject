package RetryLogicDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

	//counter to keep track of retry attempts
	
	int counterForRetryAttemps = 0 ;
	
	//set max limit for retry
	
	int setMaxLimitForRetry = 3;
	
	
	//Method to retry failed test cases
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(!result.isSuccess()) {
			
			if(counterForRetryAttemps < setMaxLimitForRetry )  {
				
				counterForRetryAttemps++;
				return true;
			}
			
		}
		return false;
	}
	
	
	
}
