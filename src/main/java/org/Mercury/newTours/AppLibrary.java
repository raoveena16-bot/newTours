package org.Mercury.newTours;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppLibrary {
	
	public static  Properties readConfig(String fileName) throws IOException {
		
		// Create a File object for the properties file 
		File f = new File("config//" + fileName);
		System.out.println(f.getAbsolutePath());
		
		

		// Create a FileInputStream to read the properties file
		FileInputStream fis = new FileInputStream(f);
		
		// Create a Properties object to load the properties from the file
		Properties prop = new Properties();
		prop.load(fis);
		
		
		return prop;
	}

}
