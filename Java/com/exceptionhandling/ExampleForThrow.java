package com.exceptionhandling;

import java.util.Scanner;

public class ExampleForThrow {
	public static void checkAgeEligiblity(int age) throws InvalidAgeException {
		try {
			if (age > 18) {
				System.out.println("Access granted - You are old enough!");
			} else {
				throw new InvalidAgeException("Access denied - You must be at least 18 years old.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (age < 18) {
				System.out.println("come back after you get " + (18 - age) + " years");
			}
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter age");
		int age = objScanner.nextInt();
		checkAgeEligiblity(age);
		objScanner.close();
	}
}
