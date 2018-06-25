package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class UtilMethods {
	
	
	/* Method Parameters: filename(config), Key
	 * Return Type: Value from config file
	 * Description: Method to read config proprties file
	 */
	
	public String readPropertiesFile(String fileName, String key) throws Exception{
		
		if(key.isEmpty()) {
			 throw new Exception("Key missing");
		}
		String value = "";
		Properties prop = new Properties();
		String filePath= System.getProperty("user.dir")+"\\"+fileName;
		System.out.println();
		try {
			FileInputStream file = new FileInputStream(filePath);
			prop.load(file);
			value = prop.getProperty(key).trim();
		} catch (Exception e) {
			System.out.println("File does not exist");
			e.getMessage();
		}
		return value;		
	}
	
	
	
}
