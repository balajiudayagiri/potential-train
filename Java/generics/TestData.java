package com.generics;

public class TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataType1<?> objType1 = new DataType1<>(1234, "HelloWorld");

		objType1.print();
		System.out.println("a = " + objType1.a.getClass());
		System.out.println("c = " + objType1.c.getClass());
		System.out.println();
		DataType2<String,Integer> objType2 = new DataType2<>("Hello", 12345);
		objType2.print();
		System.out.println("a = " + objType2.aT.getClass());
		System.out.println("c = " + objType2.bV.getClass());
	}

}
