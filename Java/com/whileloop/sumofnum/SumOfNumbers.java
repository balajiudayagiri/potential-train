package com.whileloop.sumofnum;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		
		int sum = 0;
		while(sum<100) {//this condition is for limit to add upto
			System.out.println("Enter the number");
			int num = objScanner.nextInt();
			
			if(num<0) { //this is to ignore -ve values
				continue;
			}
			if(num==999) { //this is to end the addition
				break;
			}
			
			sum=sum+num; //this is to add the values
		}
		System.out.println("Sum = "+sum);
		
		objScanner.close();
	}

}
