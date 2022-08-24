package com.innerclasses;

public class StaticNestedClass {
	static class ClassInner {
		public static void innerMethod() {
			System.out.println("StaticNestedClass:- innerMethod of static ClassInner");
		}
	}
}
