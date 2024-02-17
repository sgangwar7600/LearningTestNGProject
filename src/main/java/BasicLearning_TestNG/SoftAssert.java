package BasicLearning_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


import io.github.bonigarcia.wdm.WebDriverManager;


public class SoftAssert {

	@Test
	public void testMethodd() {

		//Launch chrome browser
		WebDriverManager.chromedriver().getDownloadedDriverVersion();
		WebDriver driver = new ChromeDriver();

		SoftAssert softVerify= new SoftAssert();

		//open url
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("verifying the title........................................");

		String expectedTitle = "Automation Testing Practice" ;
		String actualTitle = driver.getTitle();
		//softVerify.assertEquals(expectedTitle, actualTitle, "Title verifying");

		System.out.println("verifying presence of wikipedia-icon....................... ");

		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		//softVerify.assertTrue(icon.isDisplayed());

		//

		System.out.println("verifying presence of wikipedia-icon search button............. ");

		WebElement searchBtn = driver.findElement(By.className("wikipedia-search-button"));
		//softVerify.assertTrue(searchBtn.isDisplayed());


		driver.close();

		//report all failure messages
		//softVerify.assertAll();
	}

}
