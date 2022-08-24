package com.generics;

public class DataType2 <T, V> {
	public T aT;
	public V bV;
	public DataType2(T aT, V bV) {
		super();
		this.aT = aT;
		this.bV = bV;
	}
	public void print() {
		System.out.println("aT = "+aT+"\nbV = "+bV);
	}
}
