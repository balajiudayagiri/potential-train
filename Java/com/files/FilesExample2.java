package com.files;

import java.io.FileReader;
import java.io.IOException;

public class FilesExample2 {

	public static void main(String[] args) throws IOException {
		FileReader objFileReader = new FileReader("E:\\java\\myPracticeClass\\files\\files1.txt");
		int i;
		while ((i=objFileReader.read())!=-1) 
			System.out.print((char)i);
		objFileReader.close();
	}

}
