package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {

		//Launch the browser
		WebDriverManager.chromedriver().getDownloadedDriverVersion();
		WebDriver driver = new ChromeDriver();
		
		//create object of login page
		//LoginPage LoginPG = new LoginPage(driver);
		
		LoginPag2 LoginPG = new LoginPag2(driver);

		//open url
		driver.get("https://www.saucedemo.com/");
		LoginPG.enterUserName("standard_user");
		LoginPG.enterPassword("secret_sauce");
		LoginPG.ClickOnLoginBtn();
		
	}

}
