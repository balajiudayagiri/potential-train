package com.varargs;

public class VarArgFuntionSumofNumbersExample {

	public static float add(float... args) {
		float sum = 0.0f;
		for (float f : args) {
			sum += f;
			System.out.print(f + " ");
		}
		return sum;
	}

	public static int add(int... args) {
		int sum = 0;
		for (int f : args) {
			sum += f;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nAddition : \n" + add(1.2f, 2.3f, 3.4f, 4.5f, 5.6f));

	}

}
