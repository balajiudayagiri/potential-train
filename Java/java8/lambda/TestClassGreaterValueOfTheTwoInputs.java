package com.java8.lambda;

public class TestClassGreaterValueOfTheTwoInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		this is a single line lambda expression so we don't need curly braces
		GreaterValueOfTheTwoInputs objInputs = (a, b) -> (a > b) ? a : b;
		System.out.println(objInputs.greaterValue(40, 30));
	}

}
