package com.passbyvalue;

public class Calculator {
	
	int x,y;
	public  void  add(int x, int y) {
		System.out.println(x+" + "+y+" = "+ (x+y));
	}
	
	public  void  sub(int x,int y) {
		System.out.println(x+" - "+y+" = "+ (x-y));
	}
	public void div(int x,int y) {
		System.out.println(x+" / "+y+" = "+ (x/y));
	}
	
	public void mult(int x, int y) {
		System.out.println(x+" * "+y+" = "+ (x*y));
	}
	
	public static void display(Calculator objCalculator) {
		objCalculator.add(objCalculator.x, objCalculator.y);
		objCalculator.sub(objCalculator.x, objCalculator.y);
		objCalculator.div(objCalculator.x, objCalculator.y);
		objCalculator.mult(objCalculator.x, objCalculator.y);
	}
}
