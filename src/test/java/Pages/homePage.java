package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	WebDriver driver;
	
	private By registerLink = By.linkText("REGISTER");
	private By flightsLink = By.linkText("Flights");
	private By signOnLink = By.linkText("SIGN-ON");
	
	
	public void homePage(WebDriver driver) {
		this.driver = driver;
		
	}
  public void navigateToRegisterPage() {
	  driver.findElement(registerLink).click();
  }
  
  public void navigateToFlightsPage() {
	  driver.findElement(flightsLink).click();
  }
  
  public void navigateToSignOnPage() {
	  driver.findElement(signOnLink).click();
  }
  
  
}
