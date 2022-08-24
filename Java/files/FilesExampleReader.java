package com.files;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilesExampleReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader objBufferedReader = new BufferedReader(
				new FileReader("E:\\java\\myPracticeClass\\files\\personList.txt"))){
			String string;
			while ((string=objBufferedReader.readLine()) != null) {
				System.out.println(string);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("An Error occurred");
		}
	}

}
