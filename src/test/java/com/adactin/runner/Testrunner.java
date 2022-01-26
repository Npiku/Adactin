package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.properties.FileReaderManager;

import MavenProject.Adactin.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\adactin.feature",
glue = "com\\adacin\\stepdefinaion"
//tags = ("@hotelpage"),
//monochrome= true,
//dryRun =false
)
public class Testrunner {
	

	public static WebDriver driver;
	
	
	@BeforeClass
	public static void browser() throws Throwable {
		
		String browser = FileReaderManager.getInstance().getInstanceCr().getbrowser();
		

	driver = BaseClass.Browserlanch(browser);
	}
	

	
}
