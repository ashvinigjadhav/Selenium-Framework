package com.dhyanyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dhyanyog.common.WebDriverFactory;



public class HomePage {
	@FindBy(id="welcome") //annotation
    WebElement msgwelcome;
	
	@FindBy(id="menu_admin_viewAdminModule") //annotation
    WebElement admintab;
	
	
	public HomePage() {
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public HomePage verifywelcomemsg(String welcomeuserName)
	{
	
	Assert.assertEquals(msgwelcome.getText(),welcomeuserName);

	return this;
	}
	
	public AdminPage navigateaddAdminPage() {
		admintab.click();
		return new AdminPage();
		
	}
	
	
}
