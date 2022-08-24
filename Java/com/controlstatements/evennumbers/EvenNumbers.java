package com.controlstatements.evennumbers;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		
		System.out.println("Enter the number limit to find the even numbers");
		int num = objScanner.nextInt();
		
		for(int i =1;i<=num;i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		objScanner.close();
	}

}
