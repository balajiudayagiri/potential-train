package com.java8.functionalinterface;

import java.util.function.Function;

public class FuntionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Function<input T,output R> => data value
		
//		here T taks the input for the Function object and send it to the variable used in the expression 
//		and again the the data sent out from the Function to the apply() method
		
//		A function is a type of functional interface in Java that receives only a single argument and
//		returns a value after the required processing. There are many versions of Function interfaces
//		because a primitive type can’t imply a general type argument, so we need these versions of 
//		function interfaces. Many different versions of the function interfaces are instrumental and 
//		are commonly used in primitive types like double, int, long. The different sequences of these 
//		primitive types are also used in the argument.
		Function<Integer, Integer> objFunction = i -> i * i;
		System.out.println(objFunction.apply(20));
	}

}
