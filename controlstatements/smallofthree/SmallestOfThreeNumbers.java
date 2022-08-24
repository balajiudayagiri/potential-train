package com.controlstatements.smallofthree;

import java.util.Scanner;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {
		int smallest;
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = objScanner.nextInt();
		System.out.println("Enter the second number");
		int b = objScanner.nextInt();
		System.out.println("Enter the third number");
		int c = objScanner.nextInt();

		if(a<b) {
            if(c<a) {
                smallest = c;
            } else {
                smallest = a;
            }
        } else {
            if(b<c) {
                smallest = b;
            } else {
                smallest = c;
            }
        }
         
        System.out.println(smallest + " is the smallest.");
        objScanner.close();
	}

}
