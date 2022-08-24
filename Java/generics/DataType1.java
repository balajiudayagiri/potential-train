package com.generics;

public class DataType1<T> {
	public T a;
	public T c;
	public DataType1(T a, T c) {
		super();
		this.a = a;
		this.c = c;
	}
	public void print() {
		System.out.println("a = "+a+"\nc = "+c);
	}
}
