package org.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
	static Properties prop;
	
	public static void readPropertyFile() {
		try {
			File srcPath = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Config2.properties");
			FileInputStream fis = new FileInputStream(srcPath);
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Constant.BROWSER = prop.getProperty("browser");
		Constant.URL = prop.getProperty("url");
		

	}

}
