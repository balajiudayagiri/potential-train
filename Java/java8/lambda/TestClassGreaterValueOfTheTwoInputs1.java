package com.java8.lambda;

public class TestClassGreaterValueOfTheTwoInputs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Block lambda expression 
		GreaterValueOfTheTwoInputs objInputs = (a,b) -> {
			int temp = a;
			if(b>a) temp = b;
			return temp;
		}; 
		System.out.println(objInputs.greaterValue(40, 50));
	}
}
