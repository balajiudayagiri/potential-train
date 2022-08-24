package com.nnn;

public class ArraysExample {

	public static void main(String[] args) {
//		there are two types of array declaration 
//		type1
//		-----
		int[] a = new int[5];//declaration and instantiation 
		a[0] = 10;//initialization  
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println("\ntype 1 output :");
		for(int x : a) {
			System.out.println(x);
		}
		
//		type2
//		-----
		int[] b = {10,20,30,40,50};
		System.out.println("\ntype 2 output :");
		for(int x : b) {
			System.out.println(x);
		}
		for (int i = 0 ; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
