package com.annotation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class TestSingleValuAnnotation {
static int limit;
	@SingleValuAnnotation(size = 5)
	public static void stringName() throws NoSuchMethodException, SecurityException {
		TestSingleValuAnnotation objTestSingleValuAnnotation =new TestSingleValuAnnotation();
		Class<?> objClass = objTestSingleValuAnnotation.getClass();
		Method objMethod = objClass.getMethod("stringName");
		SingleValuAnnotation objAnnotation = objMethod.getAnnotation(SingleValuAnnotation.class);
		limit = objAnnotation.size();
	}
	
	public static void limitCheck(String name) throws NoSuchMethodException, SecurityException {
		stringName();
		String finalName;
		if(name.length()<=limit) finalName = name;
		else finalName = "the data is large use a shorter data the limit is "
							+limit+" charactors";
		System.out.println("the data is stored as '"+finalName+"' in files");
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter the data to save");
		limitCheck(objScanner.next());
		objScanner.close();
	}

}
