package com.java8.functionalinterface;

import java.util.function.Function;

class Student {
//	we have created a class student that contains the student data such as name marks 
//	and id all these defines the attributes of the student data type 
	String nameString;
	int marks,id;
	public Student(String nameString, int marks, int id) {
		super();
		this.nameString = nameString;
		this.marks = marks;
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public int getMarks() {
		return marks;
	}
	public int getId() {
		return id;
	}
	
}

public class StudentMarksData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input for the Student class as an array
		Student[] studentsData = {new Student("BALAJI", 99, 1274),
								  new Student("MANI", 98, 1275),
								  new Student("KANTA", 97, 1276)}; 
		
//		Funtion<T,R> here T means the datatype that will be given and the R is the ReturnType
//		here we use the Student data type to define the data 
//		and we compare the grades using if-else statements 
//		Function<input T,output R> => data value
		Function<Student, String> objFunction = s->{
			int marks = s.marks;
			String gradeString = "";
			if(marks>=90) gradeString = "A grade";
			else if(marks>=80) gradeString = "B grade";
			else if(marks>=70) gradeString = "C grade";
			else if(marks>=60) gradeString = "D grade";
			else if(marks>=50) gradeString = "E grade";
			else gradeString = "FAIL";
			return gradeString;
		};
//		here we use the for-each loop to iterate the array
//		here we pass the data by using the .apply() method to send the data to the object of 
//		the Function
		for (Student student : studentsData) {
			System.out.println("NAME  : "+student.getNameString()
							  +"\nMARKS : "+student.getMarks()
							  +"\nid    : "+student.getId()
							  +"\nGRADE : "+objFunction.apply(student)
							  +"\n-------------------");
		}
	}

}
