package ui_components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bds_Queries.ServicesCall;

public class LoginComponent 
{
	@FindBy(name="userName")
	static WebElement userNameEditbox;
	
	@FindBy(name="password")
	static WebElement passwordEditbox;
	
	@FindBy(xpath="//*[@name='login']")
	static WebElement loginButton;
	
	@FindBy(xpath=".//*[@src='/images/spacer.gif']//following::font")
	static WebElement LoginVerificationText;
	
	public  void login()
	{
	userNameEditbox.sendKeys("batman");
	passwordEditbox.sendKeys("batman");
	loginButton.click();
	}
	
	
	public boolean verifyLoginFunc()
	{
	String actualText=LoginVerificationText.getText();
	String expectedText=ServicesCall.getLoginVerificationText();
	if(actualText.equals(expectedText))

	return true;

	else
	return false;
	}

}
