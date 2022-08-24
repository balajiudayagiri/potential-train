package com.reflectionapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.serializeanddeserialize.EmployeeData;

public class Example1 {

	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Class<?> objClass = EmployeeData.class;
		
		System.out.println("##----------class----------");
		EmployeeData objEmployeeData = new EmployeeData("Udayagiri", "Balaji", "Banglore", "Product_Development",
				"Full_Stack_Developer", 25, 1274, 1122334455);
		Class<? extends EmployeeData> objClass2 = objEmployeeData.getClass();
		System.out.println(objClass2);
		
		System.out.println("\n##----------Fields----------");
		Field[] objFields = objClass.getDeclaredFields();
		for (Field field : objFields) {
			System.out.println(field);
			field.setAccessible(true);
			System.err.println(field.get(objEmployeeData));
		}
		
		System.out.println("\n##----------Methods----------");
		System.out.println("\n##----------Methods declared in the current class----------");
		Method[] objMethods = objClass.getDeclaredMethods();
		for (Method method : objMethods) {
			System.out.println(method);
		}
		System.out.println("\n##----------Methods in current class including\n private methods and inherited methods----------");
		Method[] objMethods2 = objClass.getMethods();
		for (Method method : objMethods2) {
			System.out.println(method);
		}
		
		System.out.println("\n##----------Constructor----------");
		Constructor<?>[] objConstructors = objClass.getConstructors();
		for (Constructor<?> constructor : objConstructors) {
			System.out.println(constructor);
			Parameter[] objParameters = constructor.getParameters();
			for (Parameter parameter : objParameters) {
				System.out.println(parameter);
			}
			
		}
		
		System.out.println("##----------Constructor----------");
		
	}

}
