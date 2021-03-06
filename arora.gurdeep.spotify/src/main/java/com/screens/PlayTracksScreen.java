package com.screens;




import com.base.BaseMethods;


public class PlayTracksScreen extends BaseMethods {
		
	/* Method Parameters: None
	 * Return Type: None
	 * Description: Method to mximise application client window
	 */
	public void maximiseWindow() { 
		waitTime(1000);
		String restoreButtonImage= getImageByName("MaximiseWindow_button");
		click(restoreButtonImage);
		waitTime(1000);
	}
	
	/* Method Parameters: None
	 * Return Type: None
	 * Description: Method to search tracks on Home screen 
	 */
	public void searchTracks(String trackToSearch_txt) {
		waitTime(1000);
		String searchImage= getImageByName("search");
		click(searchImage);
		waitTime(600);
		sendKeys(trackToSearch_txt);
		waitTime(2000);
	}
	
	 /* Method Parameters: None
	 * Return Type: Nonegu
	 * Description: Method to select track to play
	 * @throws FindFailed 
	 */
	public void selectTrack() {
		waitTime(500);
		String trackImage= getImageByName("Track_image");
		click(trackImage);
		waitTime(2000);
	}

	
	/* Method Parameters: None
	 * Return Type: None
	 * Description: Method to play track
	 */
	public void playTrack() {
		waitTime(500);
		String playBtnImage= getImageByName("Play_button");
		click(playBtnImage);
		waitTime(1000);
		System.out.println("Song being played !!!");
		waitTime(5000);
	}
	
	/* Method Parameters: None
	 * Return Type: None
	 * Description: Method to pause track
	 */
	public void pauseTrack() {
		waitTime(500);
		String pauseImage= getImageByName("PauseBtn_image");
		click(pauseImage);
		waitTime(1000);
	}
	
}	
	
	

