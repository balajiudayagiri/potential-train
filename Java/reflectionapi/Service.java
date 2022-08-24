package com.reflectionapi;

public class Service {
	@SuppressWarnings("unused")
	private void data(int a,int b) {
		System.out.println("private void data(){\n\n"+a+"+"+b+"="+(a+b)
				+"               ->private field invoked\n\n}");
	}
	public void add(int a,int b) {
		System.out.println("public field invoked\n"+(a+b)+"\n");
	}
	
}
