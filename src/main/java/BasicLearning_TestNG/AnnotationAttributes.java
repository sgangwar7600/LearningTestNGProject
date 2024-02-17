package BasicLearning_TestNG;

import org.testng.annotations.*;


public class AnnotationAttributes {

		@Test(dependsOnMethods = {"testcase2"})
		public void testcase1 () {
			
			System.out.println("Mobile login testcase");
	}
	
		@Test
		public void testcase2 () {
		
			System.out.println("WebAPI login testcase");
	}
	
		@Test
		public void testcase3 () {
	
				System.out.println("API login testcase");
			}
	
	
}
