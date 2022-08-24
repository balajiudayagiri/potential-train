package com.innerclasses.anonymousinnerclass;


public class B {
	static A objA = new A() {
		public void method() {
			System.out.println("inner class in anonymous inner class class invoked");
		}
	};
	
	
}
