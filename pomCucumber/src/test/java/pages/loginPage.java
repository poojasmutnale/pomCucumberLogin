package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver;
	
	By txt_username = By.id("username");
	By txt_password = By.id("password");
	By btn_login = By.id("login");
	
	public loginPage(WebDriver driver) {  // constructor to set driver
		this.driver = driver;
		
		if(!driver.getTitle().equals("Test Login | Practice Test Automation")) {
			throw new IllegalStateException("This is not login page. The current page is"+driver.getCurrentUrl());
		}
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickButton() {
		driver.findElement(btn_login).click();
	}
}
