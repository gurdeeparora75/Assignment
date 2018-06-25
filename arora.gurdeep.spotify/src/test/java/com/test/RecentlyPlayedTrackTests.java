package com.test;

import org.testng.annotations.Test;
import com.screens.PlayTracksScreen;
import com.screens.RecentlyPlayedScreen;



public class RecentlyPlayedTrackTests {
	RecentlyPlayedScreen recentTracks= new RecentlyPlayedScreen();
	PlayTracksScreen playTracks= new PlayTracksScreen();		
		
	@Test (priority=6)
	public void openRecentTracks() {
		recentTracks.clickOnRecentlyPlayedOption();
	}
	
		
}
