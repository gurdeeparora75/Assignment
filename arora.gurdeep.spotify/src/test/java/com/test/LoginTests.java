package com.test;


import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.screens.LoginScreen;
import com.util.UtilMethods;


public class LoginTests {
	LoginScreen loginPage= new LoginScreen();
	BaseClass baseClass= new BaseClass();
	UtilMethods util= new UtilMethods();
	
	@BeforeSuite
	public void lauchAppClient() {
		baseClass.launchSpotifyClient();
		baseClass.doubleClickOnAppIcon();
		
	}
	
	@Test (priority=1)
	public void login_invalidCredentials() throws FindFailed {
		try {
			String username= util.readPropertiesFile("username");
			String password= util.readPropertiesFile("password_invalid");
			loginPage.login(username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority=2)
	public void login_validCredentials() throws FindFailed {
		try {
			String username= util.readPropertiesFile("username");
			String password= util.readPropertiesFile("password_valid");
			loginPage.login(username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@AfterSuite
	public void closeApp() {
		baseClass.tearDown();
		baseClass.closeApp();
	}
	
	
	
	
	
}
