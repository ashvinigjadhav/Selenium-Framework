package com.dhyanyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.dhyanyog.common.WebDriverFactory;

public class AdminPage {
	
	
	@FindBy(id="btnAdd") //annotation
    WebElement addBtn;

	 @FindBy(id="systemUser_employeeName_empName")
	WebElement empName;
	 @FindBy(id="systemUser_status")
		WebElement User_status;
	 @FindBy(id="systemUser_userName")
		WebElement userName;
	 @FindBy(id="systemUser_password")
		WebElement passworde;
	 @FindBy(id="systemUser_confirmPassword")
		WebElement confirmPassword;
	 
	 @FindBy(id="btnSave") //annotation
	    WebElement btnSave;
	 
	 @FindBy(id="UserHeading") //annotation
	    WebElement UserHeading;
		
	
	
	
	public AdminPage() {
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
		
	}
	
/*	
	public void verifyAdduserpage()
	{
	
	Assert.assertEquals(UserHeading.getText(),"Add User");
	}
*/	
	
	public AdminPage AddUserdata() throws InterruptedException {
		addBtn.click();
		Thread.sleep(5000);
		empName.sendKeys("aEASHVINI1");
		//User_status.getAttribute("Admin");
		userName.sendKeys("ASHVINI1");
		passworde.sendKeys("ASHVINI123");
		confirmPassword.sendKeys("ASHVINI123");
		btnSave.click();
		return this;
	}
}
