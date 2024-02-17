import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.codec.binary.Base64;


public class EncodePasswordExample {

	public static void main(String[] args) {


		//encode password
		//String password = "admin123";
		//byte[] encodeedPassword = Base64.encodeBase64(password.getBytes());
		//System.out.println(new String(encodeedPassword));
		
		WebDriverManager.chromedriver().getDownloadedDriverVersion();
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		//enter username
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//decode password
		byte[] decodepassword = Base64.decodeBase64("YWRtaW4xMjM=");
		
		//enter password
		driver.findElement(By.name("password")).sendKeys(new String(decodepassword));
		
		//click on login button
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		

	}

}
