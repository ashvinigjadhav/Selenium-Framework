package com.dhyanyog.page;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dhyanyog.common.WebDriverFactory;



public class LoginPage {
	
	
	@FindBy(id="txtUsername") //annotation
     WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(xpath="//span[text()='( Username : Admin | Password : admin123 )']")
	WebElement loginhint;
	
	
	@FindBy(id="btnLogin")
	WebElement loginBtn;
	
	public LoginPage() {
		
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public LoginPage printfont() {
	/*	System.out.println(loginhint.getText());
		System.out.println(loginhint.getCssValue("color"));
		System.out.println(loginhint.getCssValue("font-size"));
		System.out.println(loginhint.getCssValue("font-family"));
		*/
		return this;
		
	}
	
	
	public LoginPage printlink() {
		
		List <WebElement> links = WebDriverFactory.getDriver().findElements(By.tagName("a"));
		//List <WebElement> links2 = WebDriverFactory.dr.findElements(By.ByXPath ="//a[strt_with='( Username : Admin | Password : admin123 )']"
			
		
		links.forEach(link->System.out.println(link.getAttribute("href")));	
			
		
		Iterator<WebElement> itr=links.iterator();
				
				while(itr.hasNext())
				{
					System.out.println(itr.next().getAttribute("href"));		
				}
		
		return this;
		
	}
	
	public HomePage login(String strUserName,String strPassword)
	{
	userName.sendKeys(strUserName);
	password.sendKeys(strPassword);
	loginBtn.click();
	return new HomePage();
	}
}
