package com.dhyanyog.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.dhyanyog.common.BaseSelenium;
import com.dhyanyog.common.IInvokedListnerimpl;
import com.dhyanyog.page.HomePage;
import com.dhyanyog.page.LoginPage;


@Listeners(IInvokedListnerimpl.class)
public class LoginTest extends BaseSelenium {

	@Test(dataProvider="loginData")
		public void verifyLoginAdminSuessful(String userName,String password) throws InterruptedException  {
		Thread.sleep(5000);
		// TODO Auto-generated method stub

		LoginPage Lp = new LoginPage();
		Lp.printfont()
		   .printlink()
		    .login(userName,password) 
		       .verifywelcomemsg("Welcome Admin");
		

	}
	/*
		@Test
		public void verifyLoginwrongpassword() throws InterruptedException  {
			Thread.sleep(5000);
			// TODO Auto-generated method stub

			LoginPage Lp = new LoginPage();
			Lp.printfont()
			   .printlink()
			    .login("admin123","admin123"); 
			 

		}
		

			@Test
			public void verifyLoginAdminEmpty() throws InterruptedException  {
				Thread.sleep(5000);
				// TODO Auto-generated method stub

				LoginPage Lp = new LoginPage();
				Lp.printfont()
				   .printlink()
				    .login("  ","admin"); 
				      
				

			}
			
				@Test
				public void verifyLoginpasswordempty() throws InterruptedException  {
					Thread.sleep(5000);
					// TODO Auto-generated method stub

					LoginPage Lp = new LoginPage();
					Lp.printfont()
					   .printlink()
					    .login("admin","  "); 
					      
					

				}

/*	@Test(priority = 2)
	public void verifyLoginAdminUnSuessfulwrongpassword() throws InterruptedException  {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		LoginPage Lp = new LoginPage();
		Lp.login("admin","123456");
		
	}
	

	@Test(priority = 3)
	public void verifyLoginAdminUnSuessfulwrongzUsername() throws InterruptedException {
		Thread.sleep(5000);
		LoginPage Lp = new LoginPage();
		Lp.login("aaaaaaa","admin");
		
	}
	

	@Test(priority = 4)
	public void verifyLoginAdminUnSuessfulblankUsername() throws InterruptedException  {
		Thread.sleep(5000);
		LoginPage Lp = new LoginPage();
		Lp.login("     ","admin");
		
	
	}*/
}



