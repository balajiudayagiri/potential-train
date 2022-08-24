package com.methods;

import java.util.Scanner;

public class TestMethodsFactorial {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter number ");
		int a = objScanner.nextInt();
		objScanner.close();
		Calculator objCalculator = new Calculator();
		objCalculator.factorial(a);

	}

}
