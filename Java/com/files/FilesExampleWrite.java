package com.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilesExampleWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try-with-resource 
		try (BufferedWriter objBufferedWriter = new BufferedWriter(
					new FileWriter("E:\\java\\myPracticeClass\\files\\personList.txt"))) {
			objBufferedWriter.write("BALAJI\n");
			objBufferedWriter.write("Manohar\n");
			objBufferedWriter.write("Srikath\n");
			objBufferedWriter.write("chaithu\n");
			objBufferedWriter.write("Anvesh");
			System.out.println("executed successfuly");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("An Error occurred");
		}
	}

}
