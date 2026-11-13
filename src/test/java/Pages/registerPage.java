package Pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class registerPage {
	WebDriver driver;
	private By firstNameField = By.name("firstName");
	private By lastNameField = By.name("lastName");
	private By phoneField = By.name("phone");
	private By emailField = By.name("userName");
	private By address1Field = By.name("address1");
	
	private By cityField = By.name("city");
	private By stateField = By.name("state");
	private By postalCodeField = By.name("postalCode");
	private By countryField = By.name("country");
	private By usernameField = By.name("email");
	private By passwordField = By.name("password");
	private By confirmPasswordField = By.name("confirmPassword");
	private By registerButton = By.name("register");
	
	public void registerPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void registerPage(HashMap<String, String> userData) {
		driver.findElement(firstNameField).sendKeys();
		driver.findElement(lastNameField).sendKeys();
		driver.findElement(phoneField).sendKeys();
		driver.findElement(emailField).sendKeys();
		driver.findElement(address1Field).sendKeys();
		
		driver.findElement(cityField).sendKeys();
		driver.findElement(stateField).sendKeys();
		driver.findElement(postalCodeField).sendKeys();
		Select country= new Select( driver.findElement(countryField));
		country.selectByContainsVisibleText(userData.get("country"));
		driver.findElement(usernameField).sendKeys();
		driver.findElement(passwordField).sendKeys();
		driver.findElement(confirmPasswordField).sendKeys();
		driver.findElement(registerButton).click();
	}

}
