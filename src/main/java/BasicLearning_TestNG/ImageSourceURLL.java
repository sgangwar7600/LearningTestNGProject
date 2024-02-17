package BasicLearning_TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageSourceURLL {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().getDownloadedDriverVersion();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		WebElement imageLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		//capture src attrivute value of image logo
		
		System.out.println("src attribute value" + imageLogo.getAttribute("src"));
		
		driver.quit();
	}
}
