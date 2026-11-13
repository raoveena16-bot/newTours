package org.Mercury.newTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.signOnPage;

public class LoginTest extends BaseClass {
	
	
	
	//This class inherits the WebDriver and Properties objects from BaseClass.
	//It can use the driver and prop variables directly in its test methods.
	
	
	signOnPage sPage;
	@BeforeClass
	
	public void setUp() {
		launchBrowser(prop.getProperty("url"));
		
		
	}
	
	@Test
	
	public void testLogin() {
		sPage = new signOnPage();
		sPage.signOnPage(driver);
		sPage.SignOnPage(prop.getProperty("puname"), prop.getProperty("ppword"));
		
		WebElement text = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
		
		Assert.assertEquals(text.getText(), "Login Successfully");
		System.out.println("Login was successful");
		
		
		
	}
		@AfterClass
		
		public void tearDown() {
			driver.quit();
		}
	
	

}
