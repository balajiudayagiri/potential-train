package com.java8.functionalinterface;

import java.util.function.Consumer;

class PrintData{
	public static void printStringData(String name) {
		System.out.println("NAME : "+name);
	}
}

public class ConsumerExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Consumer<T> => the direct value
//		 we refer the input data to the method directly from method name  
		Consumer<String> objConsumer = PrintData::printStringData;
//		The double colon (::) operator, also known as method reference operator in Java, 
//		is used to call a method by referring to it with the help of its class directly. 
//		They behave exactly as the lambda expressions.
		
		objConsumer.accept("UDAYAGIRI_BALAJI");
	}

}
