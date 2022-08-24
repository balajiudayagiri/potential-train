package com.lambdaExpression.predicate;

import java.util.function.Predicate;

public class Example2 {

	public static void main(String[] args) {
		Predicate<Integer> objPredicate = i -> i>10,
				objPredicate2 = i -> i<20;
				
		boolean result = objPredicate.and(objPredicate2).test(15);
		System.out.println(result);
		
		boolean result2 = objPredicate.and(objPredicate2).negate().test(15);
		System.out.println(result2);
		
	}

}
