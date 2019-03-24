package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ui_components.DpDnComponenet;
import ui_components.LoginComponent;


public class AbstractcountryDpDn {
	DpDnComponenet dpdncomponenet;
	LoginComponent loginComponent;
	WebDriver driver;
	
	public  AbstractcountryDpDn()
	{
		dpdncomponenet = new DpDnComponenet();
		loginComponent = new LoginComponent();
	}
	@BeforeTest
	public void setupEnvironment()
	{
	System.setProperty("webdriver.chrome.driver","D:\\Amruta\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");
	PageFactory.initElements(driver, dpdncomponenet);
	}
	
	@AfterTest
	public void closeEnvironment()
	{
	driver.close();
	}

}
