package com.test;

import org.testng.annotations.Test;
import com.screens.PlayTracksScreen;


public class PlayTrackTests {
	PlayTracksScreen playTrack= new PlayTracksScreen();
			
		
	@Test (priority=3)
	public void selectTrack() {
		playTrack.searchTracks("careless whisper");
		playTrack.selectTrack();
	}
	
	@Test (priority=4)
	public void playTrack() {
		playTrack.playTrack();
	}
	
	@Test (priority=5)
	public void pauseTrack() {
		playTrack.pauseTrack();
	}
	
	
	
}
