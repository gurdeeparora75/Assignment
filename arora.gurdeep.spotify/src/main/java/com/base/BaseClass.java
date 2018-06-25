package com.base;


import com.base.BaseMethods;


public class BaseClass extends BaseMethods {
			
	/* Method Parameters: None
	 * Return Type: None
	 * Description: Method to open application client 
	 */
	public void launchSpotifyClient() { 
		screen=getScreen();
		waitTime(1000);
		String searchImage= getImageByName("SearchWindows_textbox");
		enter_text(searchImage, "Spotify");
		waitTime(700);
		pressEnter();
		waitTime(1000);
	}
	
	
	/* Method Parameters: None
	 * Return Type: None
	 * Description: Method to perform doubleclick on Spotify client app icon
	 */
	public void doubleClickOnAppIcon() {
		String appIconImage= getImageByName("AppIcon");
		doubleClick(appIconImage);
		waitTime(200);
	}
	
	
	/* Method Parameters: None
	 * Return Type: None
	 * Description: Method to perform logout from application  
	 */
	public void tearDown() {
		String downArrowImage= getImageByName("DownArrow_button");
		String logoutBtnImage= getImageByName("Logout_button");
		
		click(downArrowImage);
		waitTime(1000);
		click(logoutBtnImage);
		waitTime(1000);
	}
	
	
	/* Method Parameters: None
	 * Return Type: None
	 * Description: Method to close application client 
	 */
	public void closeApp() {
		String closeBtnImage= getImageByName("Close_button");
		click(closeBtnImage);
		waitTime(1000);	
	}	
	
	
	
}	
	
	

