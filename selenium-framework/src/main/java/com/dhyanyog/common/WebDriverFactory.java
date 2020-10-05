package com.dhyanyog.common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
	
	//public static  WebDriver dr
	private static ThreadLocal <WebDriver> tL=new ThreadLocal<>();

	
	
	public static WebDriver getDriver()
	{
		return tL.get();
	}
	
	public static void setDriver(WebDriver dr) {
		
		tL.set(dr);
	}
	
}
