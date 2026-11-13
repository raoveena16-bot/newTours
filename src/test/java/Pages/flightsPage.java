package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class flightsPage {
	WebDriver driver;
	
	public void flightsPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void selectRoundTripFlight() {
		
		driver.findElement(By.xpath("//input[@value='roundtrip']")).click();
		
	}
	
	public void selectOneWayFlight() {
		
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
	}
	
	public void selectPassengers(String passengers) {
		
		Select passenger = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		passenger.selectByValue(passengers);
	}
	
	

}
