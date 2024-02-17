package PropertiesFileDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseExamplee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().getDownloadedDriverVersion();
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ReadConfigfile configFile = new ReadConfigfile();
		
		driver.get(configFile.getURLL());
							
		driver.findElement(By.id("username")).sendKeys(configFile.getUsername());
		
		driver.findElement(By.id("password")).sendKeys(configFile.getPassword());
		
		driver.findElement(By.id("submit")).click();
		
		driver.quit();
	}

}
