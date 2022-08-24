package com.varargs;

public class VarArgsGreatestNumber {
	public static int greatestOfGivenNumbers(int... a) {
		int big = 0;
		for (int i : a) {
			if (big < i)
				big = i;
		}

		return big;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Greatest number : \n" + greatestOfGivenNumbers(1, 2, 3, 43, 5, 3, 10, 2, 6, 7, 9));
	}

}
