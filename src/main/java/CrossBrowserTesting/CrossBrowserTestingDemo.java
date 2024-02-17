package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTestingDemo {

	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	
	public void LaunchBrowser(String browser) 
	{	
		switch(browser.toLowerCase()) 
		{ 
	case "chrome" :
		WebDriverManager.chromedriver().getDownloadedDriverVersion();
		driver = new ChromeDriver();
		break;
		
	case "msedge" :
		WebDriverManager.edgedriver().getDownloadedDriverVersion();
		driver = new EdgeDriver();
		break;
		
	case "firefox" :
		WebDriverManager.firefoxdriver().getDownloadedDriverVersion();
		driver = new FirefoxDriver();
		break;
		
	default:
		driver = null;
		break;
		}
	}
	
	@Test
	public void verifyTitle() {
		
		driver.get("https://www.google.com/");
		String expectedTitle = "Google";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}	
	
	@AfterMethod
	public void Quit() {
		
		driver.quit();
	}
}
