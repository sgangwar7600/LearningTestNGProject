package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//Without Page Factory
public class LoginPage {

	WebDriver driver;
	
	//constructor
	LoginPage(WebDriver d) {
		
		driver = d ;
		
	}
	
	//identifying web element 
	//create methods of operation to be informed on web elements
	
	By username = By.id("user-name");
	By password = By.id("password");
	By LoginBtn = By.id("login-button");
	
	public void enterUserName(String uname) {
		
		driver.findElement(username).sendKeys(uname);	
	}
	public void enterPassword(String pwd) {
		
		driver.findElement(password).sendKeys(pwd);	
	}
	public void ClickOnLoginBtn() {
		
		driver.findElement(LoginBtn).click();	
	}
	
	
	
	
	
	
}
