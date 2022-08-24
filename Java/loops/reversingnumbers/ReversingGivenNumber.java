package com.loops.reversingnumbers;

import java.util.Scanner;

public class ReversingGivenNumber {
	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);

		System.out.println("Enter a number to be printed in reverse : ");
		int num = objScanner.nextInt();

		for (int i = num; i >= 1; i--) {
			System.out.println(i);
		}
		objScanner.close();
	}
}
