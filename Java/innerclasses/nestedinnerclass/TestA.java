package com.innerclasses.nestedinnerclass;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.B obj = new A().new B();
		obj.method();
	}

}
