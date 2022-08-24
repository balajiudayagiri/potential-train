package com.exceptionhandling;

public class NestedTryCatchScenario {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		int a = 10,b = 1;String str = null;
		//		here we specify the Exception we are going to get
		try {
			System.out.println(a/b);
			try {
				int num = Integer.parseInt("123");
				System.out.println(num);
				try {
					System.out.println(str.length());
				} catch (NullPointerException e) {
					System.out.println(e);
				}
			} catch (NumberFormatException e) {
				System.out.println(e);
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("\nType 2\n--------\n");
//		here we are not specifying the Exception we are going to get
		try {
			System.out.println(a/b);
			try {
				int num = Integer.parseInt("123");
				System.out.println(num);
				try {
					System.out.println(str.length());
				} catch (Exception e) {
					System.out.println(e);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
