package com.adactin.pom;

import org.openqa.selenium.WebDriver;

public class PageobjManager {
	
	public WebDriver driver;

	public PageobjManager(WebDriver driver2) {

		this.driver =driver2;
	}
	
	private Book_hotel_page kp;
	
	private Booking_Conformation c;
	
	private Loginpage Np;
	
	private SearchHotel p;
	

	private SelectHotel a;
	
	public Book_hotel_page getKp() {
		kp =new Book_hotel_page(driver);
		return kp;
	}

	public Booking_Conformation getC() {
		c= new Booking_Conformation (driver);
		return c;
	}

	public Loginpage getNp() {
		Np = new Loginpage(driver);
		return Np;
	}

	public SearchHotel getP() {
		p= new SearchHotel (driver);
		return p;
	}

	public SelectHotel getA() {
		a= new SelectHotel(driver);
		return a;
	}


	

}
