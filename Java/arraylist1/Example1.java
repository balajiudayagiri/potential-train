package com.arraylist1;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		ArrayList<Integer> num1 = new ArrayList<>(num);
		
		System.out.println("num output : "+num);
		System.out.println("num1 output : "+num1);
		
		System.out.println();
		
		ArrayList<Integer> num2 = new ArrayList<>(5);
		num2.add(1);
		num2.add(2);
		num2.add(3);
		num2.add(4);
		num2.add(5);
		num2.add(6);
//		removeIf() -> follows lambda expressions
		System.out.println("num2 output : "+num2);
		num2.removeIf(a->a==2);
		System.out.println("num2 output : "+num2);
	}

}
