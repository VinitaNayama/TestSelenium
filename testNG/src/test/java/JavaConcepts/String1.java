package JavaConcepts;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class String1{

	public static void main(String d[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resource/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "C://Users");
		option.setExperimentalOption("prefs", prefs);
		
		option.addArguments("start-maximized");
		option.addArguments("disable-infobars");
		option.addArguments("version");
		//option.addArguments("make-default-browser");
		option.addExtensions(new File("F:\\Workspace\\4.0.1_0.crx"));
		option.addArguments("user-data-dir=C:\\Users\\pushkar_nayama\\AppData\\Local\\Google\\Chrome\\User Data");
		
		WebDriver driver = new ChromeDriver(option);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
		
		Thread.sleep(10000);
		
		driver.quit();
	}
}
