package ui_components;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bds_Queries.RadioServicesCall;
import bds_Queries.ServicesCall;

public class RadioComponent {
	@FindBy(name="tripType")
	static WebElement radios;

	public  void radio()
	{
		System.out.println("size of radios : "+ radios.getSize());
		System.out.println(radios);
	}
	public boolean verifyradioFunc()
	{
	Dimension actualSize=radios.getSize();
	String expectedSize=RadioServicesCall.getRadioSizeVerification();
	if(actualSize.equals(expectedSize))

	return true;

	else
	return false;
	}

}