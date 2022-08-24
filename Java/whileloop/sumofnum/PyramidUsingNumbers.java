package com.whileloop.sumofnum;

import java.util.Scanner;

public class PyramidUsingNumbers {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);

		System.out.println("Enter the Triangle size");
		int size = objScanner.nextInt();
		
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=size-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		objScanner.close();

	}

}
