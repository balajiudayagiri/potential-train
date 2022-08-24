package com.serializeanddeserialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestEmployeeSerialize {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EmployeeData objData = new EmployeeData("Udayagiri", "Balaji", "Banglore", "Product_Development",
				"Full_Stack_Developer", 25, 1274, 1122334455);
		FileOutputStream objFileOutputStream =new FileOutputStream("Emp.txt");
		ObjectOutputStream objObjectOutputStream = new ObjectOutputStream(objFileOutputStream);
		objObjectOutputStream.writeObject(objData);
		objObjectOutputStream.close();
		System.out.println("success File updated and serialized");    
		
	}

}
