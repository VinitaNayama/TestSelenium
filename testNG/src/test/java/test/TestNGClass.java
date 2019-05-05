package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass {
	@Test
	public void m1() {
		System.out.println("Inside test method");
	}
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("before test method");
	}
	@AfterTest
	public void afterTestMethod() {
		System.out.println("Inside After test method");
	}
	
	@Test()
	public void m5() {
		System.out.println();
		System.out.println("Inside test method");
	}
	@BeforeMethod
	public void m2() {
		System.out.println("This method will execute before each test method");
	}
	
	@AfterMethod
	public void m3() {
		System.out.println("This metho will execute after each method");
	}
	
	
}
