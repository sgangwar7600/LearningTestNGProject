package CookiesDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesExample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().getDownloadedDriverVersion();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//capture all the cookies
		
		Set <Cookie> cookiesList = driver.manage().getCookies();
		
		//print size/number of cookies
		System.out.println("Before the size : "  +  cookiesList.size());
		
		
		
		for(Cookie ck: cookiesList ) {
			
			//System.out.println("all values of cookies " +  ck);
			
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(ck.getName() + ":" + ck.getValue());
		}
		
		//get specific cookie according to name
		//System.out.println(driver.manage().getCookieNamed("i18n-prefs"));
		
		//create and add cookie
		Cookie cookieObje = new Cookie ("TestCookie" , "www.amazon.in" );
		
		//Now adding the cookie to the browser
		driver.manage().addCookie(cookieObje);
		
		
		
		
		
				//capture all the cookies
		
				cookiesList = driver.manage().getCookies();
				
				//print size/number of cookies
				System.out.println("after the size : "  +  cookiesList.size());
				
				
				
				for(Cookie ck: cookiesList ) {
					
					//System.out.println("all values of cookies " +  ck);
					
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println(ck.getName() + ":" + ck.getValue());
				}
				
				//delete cookie
				//driver.manage().deleteCookie(cookieObje);
				//driver.manage().deleteCookieNamed("TestCookie");
				driver.manage().deleteAllCookies();
		
				//capture all the cookies
				
				cookiesList = driver.manage().getCookies();
				
				//print size/number of cookies
				System.out.println("\nafter deleting cookies then  the size : "  +  cookiesList.size());
				
				
				
				for(Cookie ck: cookiesList ) {
					
					//System.out.println("all values of cookies " +  ck);
					
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println(ck.getName() + ":" + ck.getValue());
				}
		
		driver.quit();
		
		
	}

}
