package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ui_components.RadioComponent;



public class AbstractRadioTest {
	RadioComponent radioComponent;
	WebDriver driver;
	
	public AbstractRadioTest()
	{
		radioComponent = new RadioComponent();
	}
	@BeforeTest
	public void setupEnvironment()
	{
	System.setProperty("webdriver.chrome.driver","D:\\Amruta\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");
	PageFactory.initElements(driver, radioComponent);
	}
	
	@AfterTest
	public void closeEnvironment()
	{
	driver.close();
	}

}



