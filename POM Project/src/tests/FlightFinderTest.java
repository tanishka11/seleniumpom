package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class FlightFinderTest extends AbstractFlightFinder
{
@Test(priority=0,description="verify flight finder view")
public void verifyFlightFinder()
{
	loginComponent.login();
	flightfinedrcomponent.verifyRadioSize();
	assertTrue(flightfinedrcomponent.verifyRadioSize(),"Verify the size of triptype radio"); 
	flightfinedrcomponent.verifyCountryName();
	assertTrue(flightfinedrcomponent.verifycountrynameFunc(),"Verify country Name");
}
}
