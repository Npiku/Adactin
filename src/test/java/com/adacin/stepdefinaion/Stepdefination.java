package com.adacin.stepdefinaion;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.pom.Book_hotel_page;
import com.adactin.pom.Booking_Conformation;
import com.adactin.pom.Loginpage;
import com.adactin.pom.PageobjManager;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.properties.FileReaderManager;
import com.adactin.runner.Testrunner;

import MavenProject.Adactin.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination extends BaseClass {

	public static WebDriver driver = Testrunner.driver;

	PageobjManager pom = new PageobjManager(driver);
//
//	Book_hotel_page kp = new Book_hotel_page(driver);
//	
//	Loginpage np = new Loginpage(driver);
//	
//	SearchHotel p =new SearchHotel(driver);
//	
//	SelectHotel a = new SelectHotel (driver);
//	
//	Booking_Conformation c = new Booking_Conformation (driver);
	
	//homepaage
	@Given("^User lanuch the application$")
	public void user_lanuch_the_application() throws Throwable  {
		String url = FileReaderManager.getInstance().getInstanceCr().getUrl();
	    driver = BaseClass.geeturl(url);
	      
	}
	
	@When("^user enters the valid username \"([^\"]*)\"$")
	public void user_enters_the_valid_username(String arg1) throws Throwable {
		sendkeys(pom.getNp().getUsername(), arg1);
	  }

	@When("^user enther the Valid Passord \"([^\"]*)\"$")
	public void user_enther_the_Valid_Passord(String arg1) throws Throwable {

		sendkeys(pom.getNp().getPassword(), arg1);	    
	}


//	@When("^user enters the valid username$")
//	public void user_enters_the_valid_username()  {
//	      
//		sendkeys(pom.getNp().getUsername(),"Nithyaprakash");
//	}
//
//	@When("^user enther the Valid Passord$")
//	public void user_enther_the_Valid_Passord() throws Throwable {
//	       sendkeys(pom.getNp().getPassword(),"prakash12");
//	        
//	}

	@When("^user is able to click the login Button$")
	public void user_is_able_to_click_the_login_Button() throws Throwable {
	       Click(pom.getNp().getButton());
	        
	}

	@Then("^user verify the homepaage navigate to search hotel$")
	public void user_verify_the_homepaage_navigate_to_search_hotel() throws Throwable {
	       
	        
	}

	//search hotel
	@When("^user enters the valid location$")
	public void user_enters_the_valid_location() throws Throwable {
	       
		select(By.id("location"), "London");
	}

	@When("^user enther the Valid Hotels$")
	public void user_enther_the_Valid_Hotels() throws Throwable {
	       
		select(By.id("hotels"), "Hotel Sunshine");
	}

	@When("^user enther the Valid Room Type$")
	public void user_enther_the_Valid_Room_Type() throws Throwable {
		select(By.id("room_type"), "Standard");	       
	        
	}

	@When("^user enther the Valid Number of Rooms$")
	public void user_enther_the_Valid_Number_of_Rooms() throws Throwable {
	       
		select(By.id("room_nos"), "3");
	}

	@When("^user enther the Valid Adults per room$")
	public void user_enther_the_Valid_Adults_per_room() throws Throwable {
	       
		select(By.id("room_nos"), "2");
	}

	@When("^user enther the Valid Childrens per room$")
	public void user_enther_the_Valid_Childrens_per_room() throws Throwable {
	       
		select(By.id("room_nos"), "1");
	}

	@When("^user is able to click the search Button$")
	public void user_is_able_to_click_the_search_Button() throws Throwable {
	       Click(pom.getP().getSearchbutton());
	        
	}

	@Then("^user verify the search Hotel navigate to Select hotel$")
	public void user_verify_the_search_Hotel_navigate_to_Select_hotel() throws Throwable {
	       
	        
	}

	//Select hotel
	@When("^user select the Radio Button$")
	public void user_select_the_Radio_Button() throws Throwable {
	       
	        Click(pom.getA().getRadiobutton());
	}

	@When("^user is able to click the Continue Button$")
	public void user_is_able_to_click_the_Continue_Button() throws Throwable {
	       Click(pom.getA().getSubmit());
	        
	}

	@Then("^user verify the Select hotel navigate to Book a hotel page$")
	public void user_verify_the_Select_hotel_navigate_to_Book_a_hotel_page() throws Throwable {
	       
	        
	}

	//Book a hotel page
	@When("^user enter the valid First Name$")
	public void user_enter_the_valid_First_Name() throws Throwable {
	       
	        sendkeys(pom.getKp().getFirstname(), "prakash");
	}

	@When("^user enter the valid Last Name$")
	public void user_enter_the_valid_Last_Name() throws Throwable {
	       
	    sendkeys(pom.getKp().getLastname(), "muthu");    
	}

	@When("^user enter the valid Billing Address$")
	public void user_enter_the_valid_Billing_Address() throws Throwable {
	sendkeys(pom.getKp().getAddress(), "121 K.v.B Garden");       
	        
	}

	@When("^user enter the valid Use (\\d+) digit Credit Card No$")
	public void user_enter_the_valid_Use_digit_Credit_Card_No(int arg1) throws Throwable {

		sendkeys(pom.getKp().getCardNo(), "1234567890123456");
	        
	}

	@When("^user enter the valid Credit Card Type$")
	public void user_enter_the_valid_Credit_Card_Type() throws Throwable {
	sendkeys(pom.getKp().getCardtype(), "VISA");       
	        
	}

	@When("^user enter the valid Expiry Date$")
	public void user_enter_the_valid_Expiry_Date() throws Throwable {
	       
		select(By.id("cc_exp_month"), "1");
		select(By.id("cc_exp_year"), "2022");
		}

	@When("^user enter the valid CVV Number$")
	public void user_enter_the_valid_CVV_Number() throws Throwable {
	       
	       sendkeys(pom.getKp().getCCVNo(), "128"); 
	}

	@When("^user is able to click the Booknow Button$")
	public void user_is_able_to_click_the_Booknow_Button() throws Throwable {
	       
		Click(pom.getKp().getClick());
	        
	}

	@Then("^user verify the Book a Hotel page navigate to Booking conformation page$")
	public void user_verify_the_Book_a_Hotel_page_navigate_to_Booking_conformation_page() throws Throwable {
	       
	        
	}

	//Booking conformation page
	@When("^user is able to click the logout Button$")
	public void user_is_able_to_click_the_logout_Button() throws Throwable {
	       
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        Click(pom.getC().getLogout());
	}

	
	@Then("^user verify the Booking conformation page navigate to home page$")
	public void user_verify_the_Booking_conformation_page_navigate_to_home_page() throws Throwable {
	       
	        
	}

}
