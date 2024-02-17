package HeadLessBrowserDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxHeadlessBrowserTesting {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().getDownloadedDriverVersion();
		//WebDriver driver = new FirefoxDriver();



		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless"); 
		WebDriver driver = new FirefoxDriver(options);


		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		System.out.println("Before Title : " +  driver.getTitle());

		WebElement searchBox = driver.findElement(By.name("q"));

		//enter search keyword
		searchBox.sendKeys("temple of india");

		searchBox.sendKeys(Keys.ENTER);

		System.out.println("After Title : "  +  driver.getTitle());


		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();		

	}

}
