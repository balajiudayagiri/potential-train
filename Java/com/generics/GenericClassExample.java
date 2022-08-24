package com.generics;

public class GenericClassExample {

	public class DataClass<T>{
		public T a;
		public T c;
		public DataClass(T a, T c) {
			super();
			this.a = a;
			this.c = c;
		}
		public void print() {
			System.out.println("a = "+a+"\nc = "+c);
		}
	}
	
	public static class TestDataClass{
		public static void main(String[] args) {
			GenericClassExample objClassExample = new GenericClassExample(); 
			DataClass<?> objDataClass = objClassExample.new DataClass<>(123, "hello");
			objDataClass.print();
		}
	}
}
