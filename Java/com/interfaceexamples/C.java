package com.interfaceexamples;

public class C implements A,B {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Birds can fly.....");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Bird eats small insects");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Has High pitched sound O<...");
	}

}
