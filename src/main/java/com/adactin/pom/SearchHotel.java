package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public WebDriver driver;
	
	@FindBy(id ="Submit")
	private WebElement searchbutton;
	


	public SearchHotel(WebDriver driver2) {
		this.driver =driver2;
		
		PageFactory.initElements(driver, this);
		}
	
	public WebElement getSearchbutton() {
		return searchbutton;
	}

}
