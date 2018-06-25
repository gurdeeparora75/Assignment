package com.screens;



import com.base.BaseMethods;


public class RecentlyPlayedScreen extends BaseMethods {
	PlayTracksScreen playTracks= new PlayTracksScreen();
	
	
	/* Method Parameters: None
	 * Return Type: None
	 * Description: Method to play recently played track
	 */
	public void clickOnRecentlyPlayedOption() {
		waitTime(1000);
		String recentTrackOption= getImageByName("RecentlyPlayed");	
		String playTrack= getImageByName("PlayIcon");	
		click(recentTrackOption);
		waitTime(1000);
		click(playTrack);
		waitTime(3000);
	}
	
	
		
}	
	
	
