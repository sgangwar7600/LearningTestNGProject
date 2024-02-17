package BatchTesting;

import org.testng.annotations.*;


public class HomeScreenTest {
		
	// LaunchApplication()
	//VerifyTitle
	//VerifyLogo
	
	@Test
	public void LaunchApplication() {
		
		System.out.println("Application launched passed");
	}
	
	@Test
		public void VerifyTitle() {
		
		System.out.println("VerifyTitle passed");
	}
	
	@Test
	public void VerifyLogo() {
	
	System.out.println("VerifyLogo passed");
}
	
}
