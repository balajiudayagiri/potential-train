package com.switchcase.area;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		System.out.print("Select shape to find out the area\n<--circle-->\n<--triangle-->\n<--square-->\n====>> ");
		String shape = objScanner.next();	
		switch (shape) {
		case "circle":
			System.out.println("Enter the radius of the circle :");
			double r = objScanner.nextDouble();
			double areaofCircle = 3.1415926*r*r;
			System.out.println("the area of circle is "+areaofCircle);
			break;
		case "triangle":
			System.out.println("Enter the height of the triangle");
			double h = objScanner.nextDouble();
			System.out.println("Enter the base of the triangle");
			double b = objScanner.nextDouble();
			double areaOfTriangle = (h*b)/2;
			System.out.println("the area of the triangle is "+areaOfTriangle);
			break;	
		case "square":
			System.out.println("Enter the length of side of a square");
			double a = objScanner.nextDouble();
			double areaOfSquare = a*a;
			System.out.println("area of the square is "+areaOfSquare);
			break;	
		default:
			System.err.println("invalid data");
			break;
		}
		objScanner.close();
	}
}
