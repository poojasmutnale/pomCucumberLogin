package StepDefinitions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pages.loginPage;

public class LoginCode_POM {

//	WebDriver driver = null;
//	loginPage page;
//	
//	@Given("browser is opened")
//	public void browser_is_opened() {
//		System.out.println("Inside POM glue code, browser is open.");
//
//		String projPath1 = System.getProperty("user.dir");
//		System.out.println("The path of project is:" + projPath1);
//		System.setProperty("webdriver.chrome.driver", projPath1+"/src/test/resources/drivers/chromedriver.exe");
//
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
//	}
//
//	@When("^user enters valid (.*) and (.*)$")
//	public void user_enters_valid_username_and_password(String username, String password) {
//		page = new loginPage(driver);
//		page.enterUsername(username);
//		page.enterPassword(password);
//
//		System.out.println("Inside Step - user enters valid credentials.");
//	}
//
//	@When("clicks on login button")
//	public void clicks_on_login_button() {
//		page.clickButton();
//		System.out.println("Inside Step - clicks login button");
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() {
//		driver.getTitle().contains("Logged In Successfully");
//		System.out.println("Inside step- user navigated to home page");
//
//		driver.close();
//		driver.quit();
//	}

}
