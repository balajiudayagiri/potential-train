package com.sets;

import java.util.HashSet;

public class ExampleHashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> integers = new HashSet<>();
		boolean added = integers.add("Hello");
		boolean added2 = integers.add("Hello");
		System.out.println(added+"\n"+added2);
		System.out.println(integers);
 	}

}
