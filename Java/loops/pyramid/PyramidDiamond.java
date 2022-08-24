package com.loops.pyramid;

import java.util.Scanner;

public class PyramidDiamond {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);

		System.out.println("Enter the Triangle size");
		int size = objScanner.nextInt();

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		int sizeTwo = size - 1;

		for (int i = 1; i <= sizeTwo; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= sizeTwo * 2 - (i * 2 - 1); j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		objScanner.close();

	}

}
