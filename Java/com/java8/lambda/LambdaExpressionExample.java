package com.java8.lambda;

public class LambdaExpressionExample {

	public static void main(String[] args) {
//
		GreaterValueOfTheTwoInputs objInputs = (a, b) -> a + b;

		System.out.println(objInputs.greaterValue(1900,97));

		StringFunction objFunction = s -> s.toUpperCase();

		System.out.println(objFunction.function("hello Balaji that was"));

	}

}
