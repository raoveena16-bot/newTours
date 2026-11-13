package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signOnPage {
WebDriver driver;

private By usernameField = By.name("userName");
private By passwordField = By.name("password");
private By submitButton = By.name("submit");
	
	public void signOnPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void SignOnPage(String username, String password) {
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(submitButton).click();
	}
}
