package com.nnn;

public class AnonymousArray {
//	we can also pass an Anonymous Array in java
	public static void printArray(int arr[]) {
		System.out.println("Anonymous Array");
		for(int i : arr) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		passing anonymous array to method  
		printArray(new int[] {1,2,3,4,5});

	}

}
