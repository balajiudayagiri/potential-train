package com.lambdaExpression.predicate;

import java.util.function.Predicate;

public class Example1 {
	public static void main(String[] args) {
//		used to check the condition is true or false
//		it returns boolean output
		Predicate<Integer> objPredicate = i->i<0;
		
		System.out.println(objPredicate.test(10));
	}
}
