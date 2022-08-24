package com.loops.pyramid;

import java.util.Scanner;

public class PyramidUsingNumber3 {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);

		System.out.println("Enter the Triangle size");
		int size = objScanner.nextInt();
		int row = size;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= row; j++) {
				System.out.print(j + " ");
			}
			for (int j = row - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
			row--;
		}

		objScanner.close();

	}

}
