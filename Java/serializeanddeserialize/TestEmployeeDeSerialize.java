package com.serializeanddeserialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestEmployeeDeSerialize {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileInputStream objFileInputStream = new FileInputStream("Emp.txt");
		ObjectInputStream objObjectInputStream = new ObjectInputStream(objFileInputStream);
		EmployeeData objData = (EmployeeData) objObjectInputStream.readObject();
		System.out.println(objData);
		objObjectInputStream.close(); 
	}

}
