package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import ui_components.DpDnComponenet;


public class DpDnTest extends AbstractcountryDpDn 
{
	@Test(description="verify country name")
	public void verifycountryname()
	{
	dpdncomponenet.dpdn();
	assertTrue(dpdncomponenet.verifyDpDn(),"Verify countryname");
	}

	
}
