package com.loops.pyramid;

import java.util.Scanner;

public class TriangleRightSide {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);

		System.out.println("Enter the Triangle size");
		int size = objScanner.nextInt();

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		objScanner.close();
	}

}
