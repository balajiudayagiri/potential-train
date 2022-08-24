package com.innerclasses;

public class MethodLocalInnerClass {
	public void method() {
		 class InnerClass{
			public void methodInner() {
				System.out.println("MethodLocalInnerClass:- InnerClass's method Inner is invoked");
			}
		}
		 InnerClass objClass = new InnerClass();
		 objClass.methodInner();
	}
}
