package com.stringmethodsexamples;

import java.util.Scanner;

public class ReplaceAll {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		
		String string = objScanner.next();
		
		String changedString = string.replaceAll("a", "z");
		
		System.out.println(changedString);

		objScanner.close();
	}

}
