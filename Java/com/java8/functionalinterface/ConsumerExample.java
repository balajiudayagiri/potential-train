package com.java8.functionalinterface;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Consumer<T> => the direct value
//		The consumer interface of the functional interface is the one that accepts only one argument 
//		or a gentrified argument. The consumer interface has no return value. 
//		It returns nothing. There are also functional variants of the Consumer — DoubleConsumer, 
//		IntConsumer, and LongConsumer. These variants accept primitive values as arguments. 
//		here the Consumer provides the property for the object to just execute what we give as input
		Consumer<String> objConsumer = s -> System.out.println(s);System.out.println("HEllo");
		objConsumer.accept("BALAJI_UDAYAGIRI");
	}

}
