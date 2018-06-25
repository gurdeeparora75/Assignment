package com.screens;

import org.sikuli.script.FindFailed;

import com.base.BaseClass;
import com.base.BaseMethods;


public class LoginScreen extends BaseMethods {
		
		
	
	 /* Method Parameters: username, password
	 * Return Type: None
	 * Description: Method to perform login into application
	 * @throws FindFailed error when image is not found
	 */
	public void login(String username, String password) throws FindFailed{
		
		String downArrowImage= getImageByName("DownArrow_button");
		BaseClass baseClass= new BaseClass();
		
		if (isImageDisplayed(downArrowImage)== true) {
			baseClass.tearDown();
			waitTime(3000);
		}
		waitTime(1000);
		String image_Username= getImageByName("Username_textbox");
		clearTextInTextField(image_Username);
		waitTime(1000);
		sendKeys(username);
		
		String image_Password= getImageByName("Password_textbox");
		//waitTime(500);
		pressTab();
		clearTextInTextField(image_Password);
		waitTime(1000);
		sendKeys(password);
				
		waitTime(1000);
		String image_loginbtn= getImageByName("Login_button");
		click(image_loginbtn);
	}

	
		
	
	
}	
	
	

