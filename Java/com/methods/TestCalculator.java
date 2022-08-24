package com.methods;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator1 objCalculator1 = new Calculator1();
		
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = objScanner.nextInt();
		
		System.out.println("Enter second number");
		int y = objScanner.nextInt();
		
		objScanner.close();
		
		objCalculator1.x=x;
		objCalculator1.y=y;
		 
		objCalculator1.add();
		objCalculator1.sub();
		objCalculator1.mult();
		objCalculator1.div();
	}

}
