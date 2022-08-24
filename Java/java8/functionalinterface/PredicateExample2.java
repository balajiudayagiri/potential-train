package com.java8.functionalinterface;

import java.util.function.Predicate;

public class PredicateExample2 {
	public static void main(String[] args) {
//		=> boolean value
//		here Predicate takes the input from the test() method and return the boolean output
//		for the given input
		Predicate<String> objPredicate = str -> str.length() > 5;
		System.out.println(objPredicate.test("hell"));
	}
}
