package com.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleFiles1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File objFile = new File("E:\\java\\myPracticeClass\\files");
		objFile.mkdir();
		objFile = new File("E:\\java\\myPracticeClass\\files\\files1.txt");
		objFile.createNewFile();
//		try-with-resources Statement helps to close the resource properly
		try (FileWriter objWriter = new FileWriter(objFile);
				FileReader objReader = new FileReader(objFile)) {
			objWriter.write("hello this is a sample data in the 'file1.txt' which has the data from "
					+ "class ExampleFiles1 from package com.files ");
			
			objReader.read();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	

}
