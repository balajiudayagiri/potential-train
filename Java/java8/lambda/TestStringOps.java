package com.java8.lambda;

class Test {

	static String strReverse(String str) {
		String resultString = "";
		for (int i = str.length() - 1; i >= 0; i--)
			resultString += str.charAt(i);
		return resultString;
	}
}

public class TestStringOps {
	static String stringOP(StringFunction sf, String s) {
		return sf.function(s);
	}
	public static void main(String[] args) {
		String inputString = "Lambda Expression";
		String outputString;
//		The double colon (::) operator, also known as method reference operator in Java, 
//		is used to call a method by referring to it with the help of its class directly.
		
//		strReverse() is declared inside Test is passed as the first argument to stringOP
//		this Works because strReverse is compatible with the StringFunction funtional interface
//		so the expression Test::strReverse evaluates to a reference
		
		outputString = stringOP(Test::strReverse, inputString);
		System.out.println("original String : "+inputString);
		System.out.println("reversed String : "+outputString);
	}
}
