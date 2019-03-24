package ui_components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightFinderComponenets {
	@FindBy(name="tripType")
	static List<WebElement> triptypeRadios;
	
	@FindBy(xpath="//select[@name='fromPort']/option[@value='New York']")
	static WebElement CountryNameVerificationText;
	
	@FindBy(xpath=".//input[@value='Business']")
	static WebElement classname;
	
	
	
	public boolean verifyRadioSize()
	{
		if(triptypeRadios.size()==2)
		return true;
		else
			return false;
		
		}
	
	public void verifycountrynameFunc()
	{
		System.out.println("Selected Country name : "+ CountryNameVerificationText.getText());
	}
public boolean verifyCountryName()
{
	String actualText=CountryNameVerificationText.getText();
	String expectedText="New York";
	if(actualText.equals(expectedText))

		return true;

		else
		return false;

}

}