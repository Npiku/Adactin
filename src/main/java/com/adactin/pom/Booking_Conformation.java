package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Conformation {
	
	public WebDriver driver;
	

	public WebElement getLogout() {
		return Logout;
	}
	
	
	
	@FindBy(id ="logout")
	private WebElement Logout;

	public Booking_Conformation(WebDriver driver2) {

		this.driver =driver2;

		PageFactory.initElements(driver, this);
		
	}


}
