package com.java8.functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
//		Predicate<input T> => boolean value
//		In scientific logic, a function that accepts an argument and, 
//		in return, generates a boolean value as an answer is known as a predicate. 
//		Similarly, in the java programming language, a predicate functional interface
//		of java is a type of function which accepts a single value or argument and 
//		does some sort of processing on it, and returns a boolean (True/ False) answer.
//		The implementation of the Predicate functional interface also encapsulates the 
//		logic of filtering (a process that is used to filter stream components on the base of 
//		a provided predicate) in Java.
//		we are passing the data to the expression used as i that specify the input data 
//		by using the test() method 
		Predicate<Integer> objPredicate = i -> i % 2 == 0;
		System.out.println(objPredicate.test(10));
		System.out.println(objPredicate.test(15));
	}
}
