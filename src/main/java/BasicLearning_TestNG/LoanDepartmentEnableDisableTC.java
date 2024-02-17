package BasicLearning_TestNG;
import org.testng.annotations.*;


//<exclude name = "mobileLoginPersonalLoan" > </exclude>
//<exclude name = "MobileloginAutomobileLoan" > </exclude>
//<include name = "APIloginAutomobileLoan" ></include>
//<include name = "API.*" ></include>


public class LoanDepartmentEnableDisableTC {

	@Test
	public void mobileLoginPersonalLoan () {
		
	System.out.println("Mobile Login Personal Loan");	
	}
	
	
	@Test
	public void WebLoginPersonalLoan () {
		
		System.out.println("Web Login Personal Loan");		
	}
	
	@Test
	public void APILoginPersonalLoan () {
		System.out.println("API Login Personal Loan");	
		
	}
	
	@Test
	public void MobileloginAutomobileLoan () {
		System.out.println("Mobile Login Automobile Loan");	

	}
	
	@Test
	public void WebloginAutomobileLoan () {
		System.out.println("Web Login Automobile Loan");	

	}
	
	@Test
	public void APIloginAutomobileLoan () {
		System.out.println("API Login Automobile Loan");	

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
