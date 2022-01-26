package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel_page {


	public Book_hotel_page(WebDriver driver2) {
		this.driver =driver2;

		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCardNo() {
		return CardNo;
	}

	public WebElement getCardtype() {
		return Cardtype;
	}


	public WebElement getCCVNo() {
		return CCVNo;
	}

	public WebElement getClick() {
		return Click;
	}

	public WebDriver driver;

	@FindBy(id= "first_name")
	private WebElement firstname;

	@FindBy(id= "last_name")
	private WebElement lastname;

	@FindBy(id= "address")
	private WebElement Address;

	@FindBy(id= "cc_num")
	private WebElement CardNo;

	@FindBy(id= "cc_type")
	private WebElement Cardtype;


	@FindBy(id ="cc_cvv")
	private WebElement CCVNo;

	@FindBy(id= "book_now")
	private WebElement Click;


}
