package com.controlstatements.leapyear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		
		System.out.println("Enter the year to check leapYear or not");
		int year = objScanner.nextInt();
		boolean leap = false;

		if (year % 4 == 0) {// if the year is divided by 4
			if (year % 100 == 0) {// if the year is century
				if (year % 400 == 0) {// if year is divided by 400 then it is a leap year
					leap = true;
				}else {//if not divisible by 400
					leap = false;
				}
			}else {// if the year is not century
				leap = true;
			}
		}else {//if it is not divisible by 4
			leap = false;
		}
		
		//the boolean 'leap' will store the boolean value according to the condition   
		//the result will be shown here sir
		if (leap)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
		
		
		objScanner.close();
	}
}
