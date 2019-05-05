package Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public WebDriver driver = null;

	@BeforeTest
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resource/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.get("https://www.google.com");
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}	
}