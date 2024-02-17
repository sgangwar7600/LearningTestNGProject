package BasicLearning_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ParallelTestingForClass2 {

	@Test
	public void verifyLogin() throws InterruptedException 
	{
	WebDriverManager.chromedriver().getDownloadedDriverVersion();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/v1/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	
	Thread.sleep(2000);

	
	Assert.assertEquals(driver.getTitle(), "Swag Labs");
	
	Thread.sleep(2000);
	
	driver.quit();
		
	
}}


/*

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">

<suite name="Suite" parallel="classes" thread-count="2"> 




	<test  name="Test">


	<classes> 
		  <class name="BasicLearning_TestNG.ParallelTestinggforMethods"></class>
		  		 <class name="BasicLearning_TestNG.ParallelTestingForClass2"></class>

	</classes> 
  	</test> <!-- Test -->
  

  	
  	
</suite> <!-- Suite -->

*/