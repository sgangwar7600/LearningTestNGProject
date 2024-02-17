package BasicLearning_TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(BasicLearning_TestNG.ListenerClasss.class)

public class TestNGListenrs {

	@Test
	public void login() throws InterruptedException {
		
		WebDriverManager.chromedriver().getDownloadedDriverVersion();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).submit();
		
		//verifying webpage title
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		//driver.quit();
	}
	
	@Test
	public void testfail() {
		
		System.out.println("Failed test case");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testSkipped() {
		
		System.out.println("skipped test case");
		//throw new SkipException("skip exception throw....");
	}
	
	
}
