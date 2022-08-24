package com.methodreference;

public class Example1 {
	

	public static void main(String[] args) {
		
//		method reference to a static method using the 'ClassName::methodName'
		FI objFi = Sample::method1;
		objFi.getDataFI();
		
		System.out.println();
		
//		method reference to a instance method using the 'object::methodName'
//		while invoking the constructor the instance method of that class is invoked
		objFi = new Sample()::method2;
		objFi.getDataFI();
		
		System.out.println();
		
//		reference to a Constructor using the 'ClassName::new'
		objFi = Sample::new;
		objFi.getDataFI();
	}

}
