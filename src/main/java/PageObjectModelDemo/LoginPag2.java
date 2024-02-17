package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;


//using pagefatory
public class LoginPag2 {

	
	WebDriver driver;
	
	//constructor
	LoginPag2(WebDriver d) {
		
		driver = d ;
		
		//this method will create elements 
		PageFactory.initElements(driver, this);
	}
	
	//identify web elements
	//identify user name
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
		
	@FindBy(id="login-button")
	WebElement LoginBtn;
	
	public void enterUserName(String uname) {
		
		username.sendKeys(uname);	
	}
	public void enterPassword(String pwd) {
		
		password.sendKeys(pwd);	
	}
	public void ClickOnLoginBtn() {
		
		LoginBtn.click();	
	}
}
