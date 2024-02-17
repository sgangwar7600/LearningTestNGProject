package BasicLearning_TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

// India        Qutub Minar
// Agra         Taj Mahal
// Hyderabad    CharMinar


public class DataProviderFunctionn {

	
	@DataProvider(name = "searchDataTest")
	public Object[][] searchdata() {
		
		Object[][] searchkeyword = new Object[3][2];
		
		searchkeyword[0][0] = "India";
		searchkeyword[0][1] = "Qutub Minar";
		
		searchkeyword[1][0] = "Agra";
		searchkeyword[1][1] = "Taj Mahal";
		
		searchkeyword[2][0] = "Hyderabad";
		searchkeyword[2][1] = "CharMinar";
		
		
		return searchkeyword;
	}
		@Test(dataProvider = "searchDataTest" )
		public void googleSearch(String country, String monument) {
			
			//Launch chrome browser
			WebDriverManager.chromedriver().getDownloadedDriverVersion();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
		
			WebElement searchboxx = driver.findElement(By.id("APjFqb"));
		
			searchboxx.sendKeys(country + "  "  +  monument);
			
			driver.findElement(By.name("btnK")).click();
		
		
		
		}
}

/*
 * 
 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">




	<test thread-count="5" name="Test">


	<classes> 
		  <class name="BasicLearning_TestNG.DataProviderFunctionn"></class>
	</classes> 
  	</test> <!-- Test -->
  

  	
  	
</suite> <!-- Suite -->

*/
