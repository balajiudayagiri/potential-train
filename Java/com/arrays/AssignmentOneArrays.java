package com.arrays;

import java.util.Scanner;

public class AssignmentOneArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter The Size Of the Array");
		int size = objScanner.nextInt();
		System.out.println("----------------------------");
		int[] arr = new int[size];
		for(int i=0 ; i<size;i++) {
			System.out.println("Enter the array element "+ (i+1));
			arr[i] = objScanner.nextInt();
		}
		System.out.println("----------------------------");
		System.out.println("Array Elements are :");
		for(int x: arr) {
			System.out.print(x+" ");
		}
		objScanner.close();
	}

}
