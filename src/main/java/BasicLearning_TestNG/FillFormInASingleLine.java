package BasicLearning_TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FillFormInASingleLine {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().getDownloadedDriverVersion();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		Actions actions = new Actions(driver);
		
		Action seriesOFaction = actions.moveToElement(driver.findElement(By.id(null))).click()
										.sendKeys("", Keys.TAB)
										.sendKeys("", Keys.ENTER)
										.build();
		
		seriesOFaction.perform();
		
		
	}

}
