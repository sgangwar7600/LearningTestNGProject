package BasicLearning_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGgoogleSearch {
	
	@Parameters({"keyword"})
	@Test
	public void googleSearch(String searchdata) {
		
		//Launch chrome browser
		WebDriverManager.chromedriver().getDownloadedDriverVersion();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement searchbox =  driver.findElement(By.name("q"));
		searchbox.sendKeys(searchdata);
		
		
		Assert.assertEquals(searchdata, searchbox.getAttribute("value"));
		
		driver.quit();
		
		
		
	}
	
}

/*
 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">

	<test thread-count="5" name="Test">
	<parameter name="keyword" value="Selenium"></parameter>	 
	<classes> 
		  <class name="BasicLearning_TestNG.TestNGgoogleSearch"></class>
	</classes> 
  	</test> <!-- Test -->
  
	<test thread-count="5" name="Test1">
	<parameter name="keyword" value="Java"></parameter>	 
	<classes> 
		  <class name="BasicLearning_TestNG.TestNGgoogleSearch"></class>
	</classes> 
  	</test> <!-- Test -->
  	
  	
</suite> <!-- Suite -->
*/
