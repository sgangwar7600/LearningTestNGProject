package BasicLearning_TestNG;
import org.testng.annotations.*;


public class AutoMobileClass {
	
	@Parameters({"AutoMobileName"})
	@Test
	
	public void add(String name) {
		System.out.println("name         :         " + name );
	}
	
}


/*
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">

  <test thread-count="5" name="softwareTest">
	  <parameter name="SoftwareCompanyName" value="Infosys"></parameter>
    <classes>   
     <class name="BasicLearning_TestNG.SoftwareCompany"></class>
    </classes>
       </test> <!-- Test -->

  <test thread-count="5" name="automobileTest">
	  <parameter name="AutoMobileName" value="Maruti"></parameter>
    <classes>   
     <class name="BasicLearning_TestNG.AutoMobileClass"></class>
    </classes>
    
   
  </test> <!-- Test -->
</suite> <!-- Suite -->

*/