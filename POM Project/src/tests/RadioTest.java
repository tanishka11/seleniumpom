package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import ui_components.RadioComponent;

public class RadioTest extends AbstractRadioTest 
{
	@Test(description="verify size of radio")
	public void verifySizeOfRadio()
	{
		radioComponent.radio();
		assertTrue(radioComponent.radio(),"Verify Size of Radio");
	}

}
