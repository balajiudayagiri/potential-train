package com.methods;

public class Calculator {

	// Smallest of two numbers
	public void smallOfTwo(int x,int y) {
		if(x<y) {
			System.out.println(x+" is small");
		}else {
			System.out.println(y+" is small");
		}
	}

	//largest number among three
	public void bigOfThree(int x,int y,int z) {
		if(x>y&&x>z) {
			System.out.println(x+" is big");
		}else if (y>z) {
			System.out.println(y+" is big");
		} else {
			System.out.println(z+" is big");
		}
	}

	//Smallest of three numbers
	public void smallOfThree(int a,int b,int c) {
		if(a<b&&a<c) {
			System.out.println(a+" is small");
		}else if(b<c) {
			System.out.println(b+" is small");
		}else {
			System.out.println(c+" is small");
		}
		
	}
	
	//factorial for a given number
	public void factorial(int x) {
		int fact=1;
		for (int i = x; i > 1; i--) {
			fact = fact*i;
			
		}
		System.out.println(fact);
	}
	
	//Multiplication table
	public void multiplicationTable(int x) {
		for(int i = 1; i <=10; i++) {
			int mult = x*i;
			System.out.println(x+" * "+i+" = "+mult);
		}
	}


}
