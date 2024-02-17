package BasicLearning_TestNG;
import org.testng.annotations.*;

public class TestNGparameterDemo {

	@Test
	@Parameters({"i","j"})
	public void add(int a , int b) {
		System.out.println("add :   "         +          a+b);
	}
	
	
	
	@Test
	@Parameters({"i","j"})
	public void substraction(int a , int b) {
		System.out.println("sub               : "    + (a-b));

	}
	
	@Test
	@Parameters({"i","j"})
	public void multiply(int a , int b) {
		System.out.println("Multiply  :  "      +  (a*b));

	}
}




/*

--------XML file parameterization

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
	
<parameter name="i" value="9"></parameter>
<parameter name="j" value="6"></parameter>


 <test thread-count="5" name="Test">
   <classes>
		
    
    <class name="BasicLearning_TestNG.TestNGparameterDemo"></class>

    
   </classes>
 </test> <!-- Test -->
</suite> <!-- Suite -->


 
 
*/





























