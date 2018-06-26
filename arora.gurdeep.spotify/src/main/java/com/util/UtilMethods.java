package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class UtilMethods {
	
	
	/* Method Parameters: Key
	 * Return Type: Value from TestData file
	 * Description: Method to read TestData.proprties file
	 */
	
	public String readPropertiesFile(String key) throws Exception{
		
		if(key.isEmpty()) {
			 throw new Exception("Key missing");
		}
		String value = "";
		Properties prop = new Properties();
		String filePath= System.getProperty("user.dir")+"\\TestData.properties";
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
