package com.list.vector.stack;

import java.util.Stack;

public class ExampleStack {
	public static void main(String[] args) {
		Stack<Integer> objIntegers = new Stack<Integer>();
		objIntegers.push(1);
		objIntegers.push(2);
		objIntegers.push(3);
		objIntegers.push(4);
		objIntegers.push(5);
		objIntegers.push(6);
		objIntegers.push(7);
		
		System.out.println(objIntegers.pop());
		
		
		System.out.println(objIntegers);
	}
}
