package com.selenium.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ChildClass extends ParentClass{

	@BeforeClass
	public void beforeClass() {
		System.out.println("Child BeforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Child AfterClass");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Child BeforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Child AfterTest");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Child BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Child AfterMethod");
	}
	
	@Test(dataProvider="data")
	public void test1(String abc) throws InterruptedException {
	/*	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resource/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);

		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");

		Thread.sleep(1000);

		driver.close();*/
		System.out.println("Child test1");

	}
	
	@Test(dataProvider="data")
	public void test2(String abc) {
		System.out.println("Child test2");
	}

	@DataProvider
	public Object[][] data(){
		System.out.println("Data Provider");
		return new String[][] {{"TEST"}};
	}

}
