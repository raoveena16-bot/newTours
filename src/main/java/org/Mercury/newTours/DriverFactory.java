package org.Mercury.newTours;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class DriverFactory {
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public static void initDriver(String browserType) {
		
		if(browserType.equals("chrome"))
		{
		  ChromeOptions options = new ChromeOptions();
		// Create a map to store your profile preference overrides
		  Map<String, Object> prefs = new HashMap<String, Object>();

		  // 1. Prevent Chrome from popping up the "Offer to save password" prompt
		  prefs.put("credentials_enable_service", false);

		  // 2. Completely deactivate the profile's underlying password manager
		  prefs.put("profile.password_manager_enabled", false);

		  // 3. Skip the "Check your saved passwords / Weak password leak" security warnings
		  prefs.put("profile.password_manager_leak_detection", false);

		  // Attach the preferences map to the ChromeOptions instance
		  options.setExperimentalOption("prefs", prefs);
		  
		  driver.set(new ChromeDriver(options));
		}
		else if(browserType.equals("edge"))
		{
			driver.set(new EdgeDriver());
		}
		else
		{
			throw new IllegalArgumentException("Invalid browser type: " + browserType);
		}
		}

	public static WebDriver getDriver()
	{
		
		return driver.get();
	}
	public static void close()
	{	
		driver.remove();
		
	}


}
