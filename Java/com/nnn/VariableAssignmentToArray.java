package com.nnn;

public class VariableAssignmentToArray {
	
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30,d = 40;
		int x[] = {a,b,c,d};
		for (int i : x) {
			System.out.println(i);
		}
	}

}
