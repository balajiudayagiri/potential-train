package com.arrays;

import java.util.Scanner;

public class AssignmentTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,6,8};
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter the Number to search");
		int num = objScanner.nextInt();
		objScanner.close();
		int i,value = 0;
		boolean found = false;
		for(i = 0;i<arr.length;i++) {
			if(num==arr[i]) {
				found=true;
				value = i; 
			}
		}
		if (found) {
			System.out.println("Element found at index "+value);
		}else {
			System.err.println("Element not found");
		}
	}

}
