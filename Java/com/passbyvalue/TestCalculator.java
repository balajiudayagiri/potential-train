package com.passbyvalue;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator objCalculator = new Calculator();
		
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = objScanner.nextInt();
		
		System.out.println("Enter second number");
		int y = objScanner.nextInt();
		
		objScanner.close();
		
		objCalculator.x = x;
		objCalculator.y = y;	

		Calculator.display(objCalculator);
	}
	
	
}
