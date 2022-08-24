package com.methods;

public class Calculator1 {
	int x,y;
	
	public  void  add() {
		System.out.println(x+" + "+y+" = "+ (x+y));
	}
	
	public  void  sub() {
		System.out.println(x+" - "+y+" = "+ (x-y));
	}
	public void div() {
		System.out.println(x+" / "+y+" = "+ (x/y));
	}
	
	public void mult() {
		System.out.println(x+" * "+y+" = "+ (x*y));
	}
	
	public Calculator1() { //Object class => java.lang.Object;
		super();
	}
}
