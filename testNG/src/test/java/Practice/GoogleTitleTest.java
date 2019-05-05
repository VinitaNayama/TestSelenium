package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTitleTest extends BaseTestClass {


	@Test()
	public void test() {
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//div[@class='gb_Q gb_R']//a[@data-pid='23']")).click();
		By searchXpath = By.xpath("//input[@type ='text']");
		WebElement searchBox = driver.findElement(searchXpath);

		System.out.println(searchBox.getAttribute("type"));
		System.out.println(searchBox.getCssValue("background-color"));
		searchBox.clear();
		searchBox.sendKeys("seleniumhq");

		driver.findElement(By.xpath("//div[@class='aajZCb']//input[@value='Google Search']")).click();
		driver.findElement(By.xpath("//h3[text() ='Selenium - Web Browser Automation']")).click();
		int size = driver.findElements(By.xpath("//div[@id='sidebar']//img[@alt='Selenium Logo1']")).size();

		if(size>0) {
			System.out.println("selenium logo is present");
		} else {
			System.out.println("Selenium logo is not present");
		}
	}
}