package com.dhyanyog.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;


public class IInvokedListnerimpl implements IInvokedMethodListener {

	public void beforeInvocation(IInvokedMethod arg0, ITestResult Arg1) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
			
		 WebDriver dr=new ChromeDriver();
		   
         dr.get("http://127.0.0.1/orangehrm-3.3.1/");
           
		 dr.manage().window().maximize();
		
		WebDriverFactory.setDriver(dr);
		
		
	}
	
	
	public void afterInvocation(IInvokedMethod arg0, ITestResult Arg1) {
		WebDriverFactory.getDriver().quit();
	}
	
}
