package TestNGreportsDemo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGreportsExample2 {

	@Test
	public void googleSearch() {
		
		WebDriverManager.chromedriver().getDownloadedDriverVersion();
		WebDriver driver = new ChromeDriver();
		Reporter.log("Chrome browser opened...   ");
		
		driver.get("https://www.google.com/");
		Reporter.log("Google URL Opened...");
		
		WebElement searchbox = driver.findElement(By.id("APjFqb"));
		searchbox.sendKeys("india gate");
		Reporter.log("India Gate keyword entered...   ");

		searchbox.sendKeys(Keys.ENTER);
		Reporter.log("Enter Kry Pressed ...");

		Reporter.log("closing the browser...");
		driver.quit();
		
		
	}
}
