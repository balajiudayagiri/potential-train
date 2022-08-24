package com.reflectionapi;

import java.lang.reflect.Field;

import com.serializeanddeserialize.EmployeeData;

public class FieldSetAccessibleExample1 {
	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {

		EmployeeData objEmployeeData = new EmployeeData("Udayagiri", "Balaji", "Banglore", "Product_Development",
				"Full_Stack_Developer", 25, 1274, 1122334455);

		Field[] fields = EmployeeData.class.getDeclaredFields();

		for (Field field : fields) {
			field.setAccessible(true);
			System.out.println(field.get(objEmployeeData));
		}
	}
}
