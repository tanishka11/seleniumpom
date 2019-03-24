package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ui_components.FlightFinderComponenets;
import ui_components.LoginComponent;

public class AbstractFlightFinder {
	LoginComponent loginComponent;
	FlightFinderComponenets flightfinedrcomponent;
	WebDriver driver;
	
	public AbstractFlightFinder()
	{
		loginComponent = new LoginComponent();
		flightfinedrcomponent = new FlightFinderComponenets();
		
	}
	@BeforeTest
	public void setupEnvironment()
	{
	System.setProperty("webdriver.chrome.driver","D:\\Amruta\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");
	PageFactory.initElements(driver, loginComponent);
	PageFactory.initElements(driver, flightfinedrcomponent);
	}
	
	@AfterTest
	public void closeEnvironment()
	{
	driver.close();
	}

}


