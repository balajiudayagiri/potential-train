package com.reflectionapi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestService {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Class<?> objClass = Service.class;

		Service objService = (Service) objClass.getDeclaredConstructor().newInstance();

		Method objMethod = objClass.getDeclaredMethod("add", new Class[] { int.class, int.class }),
				objMethod2 = objClass.getDeclaredMethod("data", new Class[] { int.class, int.class});

		objMethod.invoke(objService, 10, 20);
		objMethod2.setAccessible(true);
		objMethod2.invoke(objService,20,20 );
		
		
	}

}
