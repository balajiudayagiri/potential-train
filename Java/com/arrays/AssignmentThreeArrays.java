package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentThreeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner objScanner = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<>();
		System.out.println("Enter desired names you want to save in the list");
		while (true) {
            String input = objScanner.next();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            nameList.add(input);
        }
		System.out.println(nameList);
		objScanner.close();
	}

}
