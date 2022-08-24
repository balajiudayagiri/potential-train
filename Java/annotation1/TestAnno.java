package com.annotation1;

import java.lang.reflect.Method;

public class TestAnno {
	
	@SingleValueAnnotation(getValue = 5)
	public  void methodToGetAnnotaionValue() throws NoSuchMethodException, SecurityException {
		TestAnno objTestAnno = new TestAnno();
		Class<?> objClass = objTestAnno.getClass();
		Method objMethod = objClass.getMethod("methodToGetAnnotaionValue");
		SingleValueAnnotation objAnnotation = objMethod.getAnnotation(SingleValueAnnotation.class);
		System.out.println("@SingleValueAnnotation{\n\tgetValue\n   }\n "
				+ "output for the annotation get value :- "+objAnnotation.getValue());
		
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		TestAnno objAnno = new TestAnno();
		objAnno.methodToGetAnnotaionValue();
	}

}
