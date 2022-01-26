package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public  WebDriver driver;
	
	public Loginpage(WebDriver driver2) {
		this.driver =driver2;
		
		PageFactory.initElements(driver, this);
		}
	
	

	@FindBy(id = "username")
	private  WebElement username;
	
	@FindBy(name = "password")
	private  WebElement password;
	
	@FindBy(id = "login")
	private  WebElement Button;

	
	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getButton() {
		return Button;
	}

	
		
}
