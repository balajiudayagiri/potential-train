package com.varargs;

public class VarArgsFindingTheGreatestforSumofGivenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = VarArgFuntionSumofNumbersExample.add(1, 2, 3, 5), b = VarArgFuntionSumofNumbersExample.add(2, 5, 6),
				c = VarArgFuntionSumofNumbersExample.add(7, 1, 9, 9), d = VarArgFuntionSumofNumbersExample.add(1, 2, 1);
		System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
		System.out.println(VarArgsGreatestNumber.greatestOfGivenNumbers(a, b, c, d));
	}

}
