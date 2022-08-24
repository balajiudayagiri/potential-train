package com.methods;

import java.util.Scanner;

public class TestMethodsSmallofThree {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter First number ");
		int a = objScanner.nextInt();
		System.out.println("Enter Second number ");
		int b = objScanner.nextInt();
		System.out.println("Enter Third number ");
		int c = objScanner.nextInt();
		objScanner.close();
		Calculator objCalculator = new Calculator();
		objCalculator.smallOfThree(a,b,c);

	}

}
