package com.selenium.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParentClass {

	@BeforeClass
	public void beforeClassP() {
		System.out.println("Parent BeforeClass");
	}
	
	@AfterClass
	public void afterClassP() {
		System.out.println("Parent AfterClass");
	}
	
	@BeforeTest
	public void beforeTestP() {
		System.out.println("Parent BeforeTest");
	}
	
	@AfterTest
	public void afterTestP() {
		System.out.println("Parent AfterTest");
	}
	
	@BeforeMethod
	public void beforeMethodP() {
		System.out.println("Parent BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethodP() {
		System.out.println("Parent AfterMethod");
	}
	
/*	@Test
	public void test12() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resource/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);

		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");

		Thread.sleep(1000);

		driver.close();
		System.out.println("Parent test1");

	}
	
	@Test
	public void test23() {
		System.out.println("Parent test2");
	}*/



}
