package com.java8.functionalinterface;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 It represents a function which does not take in any argument but produces a value of type T
//		T: denotes the type of the result
//		The lambda expression assigned to an object of Supplier type is used to define
//		its get() which eventually produces a value.
		
//		The Supplier functional interface is also a type of functional interface that does not take
//		any input or argument and yet returns a single output. This type of functional interface is 
//		generally used in the lazy generation of values. Supplier functional interfaces are also 
//		used for defining the logic for the generation of any sequence. For example – The logic 
//		behind the Fibonacci Series can be generated with the help of the Stream.generate method, 
//		which is implemented by the Supplier functional Interface. 
		Supplier<Double> objSupplier = () -> Math.random();
		System.out.println(objSupplier.get());
	}

}
