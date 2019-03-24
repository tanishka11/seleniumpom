package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import ui_components.LoginComponent;

public class LoginTests extends AbstractTest

{
@Test(description="verify Login")
public void verifyLogin()
{
	loginComponent.login();
	assertTrue(loginComponent.verifyLoginFunc(), "verify Login");
}
	
	
	
}
