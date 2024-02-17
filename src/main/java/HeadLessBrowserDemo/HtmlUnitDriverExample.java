package HeadLessBrowserDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlUnitDriverExample {

	public static void main(String[] args) {


		//Launch HtmlUnitDriver browser
		HtmlUnitDriver driver = new HtmlUnitDriver();
				
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		System.out.println("Before"
				+ " Title : " +  driver.getTitle());
		
		WebElement searchBox = driver.findElement(By.name("q"));
		
		//enter search keyword
		searchBox.sendKeys("India Gate");
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
