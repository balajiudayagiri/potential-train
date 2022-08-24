package com.innerclasses.anonymousinnerclass;

abstract class DATA{
	abstract void testMethod();
}

public class ExampleTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DATA objData = new DATA() {
			
			@Override
			void testMethod() {
				// TODO Auto-generated method stub
				System.out.println("DATA invoked");
			}
		};
		objData.testMethod();
	}

}
