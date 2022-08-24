package com.java8.defaultmethods;

interface Sample{
	default void method1() {
		System.out.println("method from method1()");
	}
	void data();
}

public class DefaultMthodExample {
	
	public static void main(String[] args) {
//		providing the implementation by using the lambda expression 
		Sample objSample = () -> System.out.println("abstract method in Sample.class is "
				+ "execute and implemented");
//		ALSO
//		providing implementation by using the anonymous class aproch
//		Sample objSample2 = new Sample() {
//			
//			@Override
//			public void data() {
//				// TODO Auto-generated method stub
//				System.out.println("abstract method in Sample.class is "
//				+ "execute and implemented");
//			}
//		};
		objSample.data();
//		calling the default method()
		objSample.method1();
	}
}
