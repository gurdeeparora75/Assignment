package com.test;


import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.screens.LoginScreen;


public class LoginTests {
	LoginScreen loginPage= new LoginScreen();
	BaseClass baseClass= new BaseClass();
	
	
	@BeforeSuite
	public void lauchAppClient() {
		baseClass.launchSpotifyClient();
		baseClass.doubleClickOnAppIcon();
		
	}
	
	@Test (priority=1)
	public void login_invalidCredentials() throws FindFailed {
		loginPage.login("gurdeeparora75@gmail.com", "invalidPassword");
		
	}
	
	@Test (priority=2)
	public void login_validCredentials() throws FindFailed {
		loginPage.login("gurdeeparora75@gmail.com", "gurdeep");
	}
	
	
	@AfterSuite
	public void closeApp() {
		baseClass.tearDown();
		baseClass.closeApp();
	}
	
	
	
	
	
}
