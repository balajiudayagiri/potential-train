package com.loops.multiplication;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = objScanner.nextInt();
		for(int i = 1; i <=10; i++) {
			int add = num*i;
			System.out.println(num+" * "+i+" = "+add);
		}
		
		objScanner.close();
	}
}
