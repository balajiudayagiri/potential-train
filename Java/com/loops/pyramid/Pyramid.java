package com.loops.pyramid;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		System.out.print("	Enter the desired height of the pyramid [in Integers] : ");

		Scanner objScanner = new Scanner(System.in);
		int rows = objScanner.nextInt();

		int k = 0;
		for (int i = 1; i <= rows; ++i, k = 0) {

			// this forloop will give the space
			for (int space = 1; space <= rows - i; ++space) {
				System.out.print("  ");
			}

			// this while loop will print the pattern
			while (k != 2 * i - 1) {
				System.out.print("[]");
				++k;
			}

			System.out.println();

		}
		objScanner.close();
	}
}