package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass2 {

	@AfterTest
	public void afterTestMethodClass2() {
		System.out.println("After Test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@Test(priority=1, groups ="title")
	public void method1() {
		System.out.println("Inside test method 1+priority=1");
	}

	@Test(priority=2, groups="Logo")
	public void method2() {
		System.out.println("Inside test method 2+priority=2");
	}

	@Test(priority=3,groups = "title")
	public void method3() {
		System.out.println("Inside test method 3+priority=3");
	}

	@Test(priority=1, groups="Logo")
	public void method4() {
		System.out.println("Inside test method 4+priority=1");
	}

	@Test(priority=5,groups = "title")
	public void method6() {
		System.out.println("Inside test method 5+priority=5");
	}

	@Test(expectedExceptions =NumberFormatException.class )
	public void numberFormatException() {
		String x = "100A";
		Integer.parseInt(x);
		System.out.println("NumberFormatException"+x);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test");
	}

}
