package com.controlstatements.addingnumbers;

import java.util.Scanner;

public class AddingNumbers {

	public static void main(String[] args) {
		int sum=0;
		Scanner objScanner = new Scanner(System.in);
		System.out.println("enter the number of integers to be add");
		int n = objScanner.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter the Integers to be added");
			arr[i]=objScanner.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
			sum = sum+arr[i];    
			if(i<(n-1))
				 System.out.print(" + ");
				else
				 System.out.print( " = ");
		}
		System.out.println(sum);
		objScanner.close();
	}

}
