package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreatingPropertiesFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File objFile = new File("E:\\java\\myPracticeClass\\files\\PropertiesExample");
		objFile.mkdir();
		Properties objProperties = new Properties();
		try (FileOutputStream objOutputStream = new FileOutputStream(
				"E:\\java\\myPracticeClass\\files\\PropertiesExample\\DatabaseProperties.properties");
				FileInputStream objInputStream = new FileInputStream(
						"E:\\java\\myPracticeClass\\files\\PropertiesExample\\DatabaseProperties.properties")) {
			objProperties.setProperty("DatabaseName", "JavaDatabase");
			objProperties.setProperty("port", "3000");
			objProperties.setProperty("Login_ID", "ADMIN");
			objProperties.setProperty("Password", "1234");
			objProperties.setProperty("Url", "localhost:" + objProperties.getProperty("port") + "\\"
					+ objProperties.getProperty("DatabaseName") + "\\" + objProperties.getProperty("Login_ID"));
			objProperties.store(objOutputStream, null);
			objProperties.load(objInputStream);
			System.out.println("Data uploding as " + objProperties.getProperty("DatabaseName") + " on port:"
					+ objProperties.getProperty("port") + "\nAccessing as : " + objProperties.getProperty("Login_ID")
					+ "\nThe Url is : " + objProperties.getProperty("Url"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("\nTHE DATA IS UP AND RUNNING ON -> localhost:" + objProperties.getProperty("port"));
		}
	}

}
