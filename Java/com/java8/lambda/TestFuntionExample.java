package com.java8.lambda;

public class TestFuntionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuntionExample<String> objReversingString = str -> {
			String resultString = "";
			for (int i = str.length() - 1; i >= 0; i--) resultString += str.charAt(i);
			return resultString;
		};
		System.out.println("LAMBDA reverse is " 
		+ "'" + objReversingString.methodExample("LAMBDA") + "'.");
		System.out.println("EXPRESSION reverse is " 
		+ "'" + objReversingString.methodExample("EXPRESSION") + "'.");

		FuntionExample<Integer> objData = n -> {
			int result = 1;
			for (int i = 1; i <= n; i++)
				result *= i;
			return result;
		};
		System.out.println("the factorial of 3 is '" + objData.methodExample(3) + "'.");
		System.out.println("the factorial of 5 is '" + objData.methodExample(5) + "'.");
	}

}
