package com.innerclasses;

import com.innerclasses.StaticNestedClass.ClassInner;

public class TestForInnerClassExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		----------------------------------------------------------------------------------
//		Nested Inner Class
		System.out.println("Nested Inner Class\n-------------------");
		NestedInnerClass.InnerClass obj = new NestedInnerClass().new InnerClass();
		obj.method();
		System.out.println();
//		----------------------------------------------------------------------------------
//		MethodLocalInnerClass
		System.out.println("MethodLocalInnerClass\n---------------------");
		MethodLocalInnerClass objClass = new MethodLocalInnerClass();
		objClass.method();
		System.out.println();
//		----------------------------------------------------------------------------------
//		Static Nested Class
		System.out.println("StaticNestedClass\n-----------------");
		ClassInner.innerMethod();
		System.out.println();
//		----------------------------------------------------------------------------------
//		AnonymousInnerClass
		System.out.println("AnonymousInnerClass\n-------------------");
		AnonymousInnerClassB objClass3 = new AnonymousInnerClassB();
		objClass3.a.methodA();
	}

}
