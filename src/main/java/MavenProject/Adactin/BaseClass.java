package MavenProject.Adactin;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
public static WebDriver driver;

	
	public static WebDriver Browserlanch(String browsers ) {

		if (browsers.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		}else  {

			System.out.println("Please try another browser");		}
		return driver;

	}
	
	public static WebDriver geeturl(String url) {

		driver.get(url);
		
		return driver;
		

	}


	public static void Maxi() {

		driver.manage().window().maximize();

	}


	public static void Screenshot() throws IOException {

TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);

		File destionaton = new File ("C:\\Users\\elcot\\eclipse-workspace\\Automation\\Screenshot\\aaa.png");
		
		FileHandler.copy(src, destionaton);
		

	}


	public void close() {

		driver.close();
	}
	
	
	
	public static void sendkeys(WebElement Element, String value) {
		
		Element.sendKeys(value);
	
		}
	
	public static void select(By AA, String value) {
		
		
		WebElement findElement = driver.findElement(AA);

		Select s = new Select (findElement);

		s.selectByValue(value);

		
			}
	
	public static void Click(WebElement Element) {
		
		Element.click();

		
	}
	
	public static void Clear(By dd) {
		
		dd.findElement(driver).clear();

	}

	public static void Action( WebElement aa,WebElement bb) {

		
		
		Actions b = new Actions (driver);
		
		b.dragAndDrop(aa, bb).perform();	

		
	}
	
	
	public static void attribute( By by, String value) {
		
		WebElement findElement = driver.findElement(by);
		System.out.println(findElement.getAttribute(value));
		
		
	}
	


}
