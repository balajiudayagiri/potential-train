package com.lambdaExpression.predicate;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class Example3 {

	public static void method(int n , IntPredicate objPredicate) {
		System.out.println(objPredicate.test(n));
	}
	
//	Lambda expression as parameter

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		System.out.println("enter a number");
		method(objScanner.nextInt(), i->i<20);
		objScanner.close();
	}

}
