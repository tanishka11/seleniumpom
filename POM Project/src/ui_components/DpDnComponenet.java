package ui_components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bds_Queries.DpDnServices;
;

public class DpDnComponenet {

	@FindBy(xpath="//select[@name='fromPort']/option[@value='New York']")
	static WebElement CountryNameVerificationText;
	
	public  void dpdn()
	{
		System.out.println("Selected Country name : "+ CountryNameVerificationText.getText());
	}
	public boolean verifyDpDn()
	{
	String actualText=CountryNameVerificationText.getText();
	String expectedText=DpDnServices.getDpDnVerificationText();
	if(actualText.equals(expectedText))

	return true;

	else
	return false;
	}
}
