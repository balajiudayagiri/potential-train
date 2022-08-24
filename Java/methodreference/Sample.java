package com.methodreference;

public class Sample {
	
	public static void method1() {
		System.out.println("Reference to a static method worked ");
	}
	
	public void method2() {
		System.out.println("Reference to an instance method of a particular object worked");
	}
	
	public Sample() {
		System.out.println("Reference to a constructor worked");
	}
	
	
}
