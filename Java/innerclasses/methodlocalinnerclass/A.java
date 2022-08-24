package com.innerclasses.methodlocalinnerclass;

public class A {
	public void method() {
		class B{
			public void innerClassBMethod() {
				System.out.println("inner class in method local inner class invoked");
			}
		}
		B objB = new B();
		objB.innerClassBMethod();
	}
}
