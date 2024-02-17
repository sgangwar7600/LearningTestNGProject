package BasicLearning_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ParallelTestinggforMethods {

	WebDriver driver;
	
	@Test
	public void verifyTitle() throws InterruptedException 
	{
	WebDriverManager.chromedriver().getDownloadedDriverVersion();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/v1/");
	
	Assert.assertEquals(driver.getTitle(), "Swag Labs");
	
	driver.quit();
		
	Thread.sleep(3000);
}
	
	@Test
	public void verifyLogo() 
	{
	WebDriverManager.chromedriver().getDownloadedDriverVersion();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/v1/");
	
	//Assert.assertEquals(driver.getTitle(), "Swag Labs");
	
	WebElement logo = driver.findElement(By.xpath("//div[@class = 'login_logo']"));
	
	
	Assert.assertTrue(logo.isDisplayed());
	
	driver.quit();
	
	
	
	
}}



/*
 * 
 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">

<suite name="Suite" parallel="methods" thread-count="2"> 




	<test thread-count="5" name="Test">


	<classes> 
		  <class name="BasicLearning_TestNG.ParallelTestinggforMethods"></class>
	</classes> 
  	</test> <!-- Test -->
  

  	
  	
</suite> <!-- Suite -->

*/
