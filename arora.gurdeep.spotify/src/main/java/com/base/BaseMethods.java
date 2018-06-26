package com.base;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import com.util.UtilMethods;


public class BaseMethods {

	public static Screen screen;
    public static Pattern pattern;
    public static String HOMEPATH= System.getProperty("user.dir");
    public String imagerepo_folder= HOMEPATH+"\\src\\main\\resources\\ImageRepository\\";
    
		
	public static Screen getScreen() {
		if (screen==null) {
			screen= new Screen();
		}
		return screen;
	}
	
	public String getImageByName(String imageName){
		 String imagePath= imagerepo_folder+imageName+".PNG";
		 return imagePath;
	}
	
	public static Pattern getPattern(String imagePath) {
		if (pattern==null) {
			pattern= new Pattern(imagePath);
		}
		return pattern;
	}
	
	
	public void click(String imageName) {
		try {
			waitTime(300);
			screen.click(imageName);
		} catch (Exception e) {
		}
	}
	
	public void rightClick(String imageName) {
		
		try {
			waitTime(600);
			screen.rightClick(imageName);
		} catch (FindFailed e) {
			e.printStackTrace();
		}
	}
	
	public void doubleClick(String imageName) {
		try {
			waitTime(500);
			screen.doubleClick(imageName);
		} catch (Exception e) {
			System.out.println("Error clicking the element = "+imageName);
			e.printStackTrace();
		}
	}
	
	
	public void enter_text(String imageName, String textToEnter) {
		try {
			screen.click(imageName);
			waitTime(1000);
			screen.type(textToEnter);
		}catch(Exception e) {
			System.out.println("Error in entering text in text field = "+imageName);
			e.getMessage();
		}
	}
	
		
	public void waitTime(int waitTimeInSeconds) {
		try {
			Thread.sleep(waitTimeInSeconds);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isImageDisplayed(String imageName)  {
		boolean flag= false;
		try {
			waitTime(2000);
			if (screen.exists(getImageByName(imageName)) == null) {
			flag= true;	
			}
		}catch(Exception e) {
			System.out.println("Error in finding the image = "+imageName);
			e.printStackTrace();
			flag=false;
		}
		return flag;
	}
	
		
	public void pressEnter() {
		try {
			screen.type(Key.ENTER);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error in pressing Enter key");
		}
	}
	
	public void pressTab() {
		try {
			screen.type(Key.TAB);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error in pressing Enter key");
		}
	}
	
	public void sendKeys(String text) {
		try {
			screen.type(text);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error in keying in text");
		}
	}
	
	public void clearTextInTextField(String imageName) {
		try {
			screen.click(imageName);
			waitTime(500) ;
			screen.type("a", KeyModifier.CTRL);
			waitTime(500) ;
			screen.type(Key.BACKSPACE);
		}catch(Exception e) {
		}
	}
	
	
}	