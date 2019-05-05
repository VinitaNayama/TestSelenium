import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test(enabled=true)
	public void loginTest() {
		System.out.println("Login Test");
	}

	@Test(dependsOnMethods="loginTest")
	public void HomePageTest() {
		System.out.println("Home page Test");
	}

	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest() {
		System.out.println("Search page Test");
	}
	@Test(dependsOnMethods="loginTest")
	public void RegistrationPageTest() {
		System.out.println("Registration page Test");
	}
}
