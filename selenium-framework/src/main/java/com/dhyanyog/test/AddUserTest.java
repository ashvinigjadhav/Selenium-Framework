package com.dhyanyog.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.dhyanyog.common.IInvokedListnerimpl;
import com.dhyanyog.page.LoginPage;

@Listeners(IInvokedListnerimpl.class)
public class AddUserTest   {
	
	@Test(priority = 1)
	public void verifyAddUserAdminEnable() throws InterruptedException {
		
		//object chaining 
		LoginPage Lp = new LoginPage();    
		Lp.login("admin","admin") 
		        .verifywelcomemsg("Welcome Admin")
		          .navigateaddAdminPage()
		             .AddUserdata();
	
		/*
		
		HomePage Hp= new HomePage();
	    Hp.verifywelcomemsg("Welcome Admin");
		Hp.navigateaddAdminPage();
				
		AdminPage Ap=new AdminPage();
		
	//	Ap.verifyAdduserpage();
		
		Ap.AddUserdata();*/
	
	}
}
