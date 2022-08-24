package com.java8.lambda;

public class TestStringFunction {
	static String stringOP(StringFunction sf, String s) {
		return sf.function(s);
	}

	public static void main(String[] args) {
		String inputString = "Lambda Expression";
		String outputString;

		System.out.println("input : " + inputString);

		outputString = stringOP(str -> str.toUpperCase(), inputString);
		System.out.println("output in upper case : " + outputString);

		outputString = stringOP(str -> {
			String resultString = "";
			for (int i = 0; i < str.length(); i++)
				if (str.charAt(i) != ' ')
					resultString += str.charAt(i);
			return resultString;
		}, inputString);
		System.out.println("the input with no spaces : " + outputString);

		outputString = stringOP(str -> {
			String resultString = "";
			for (int i = str.length() - 1; i >= 0; i--)
				resultString += str.charAt(i);
			return resultString;
		}, inputString);
		System.out.println("the input in reverse : " + outputString);
	}
}
