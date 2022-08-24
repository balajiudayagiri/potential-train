package com.switchcase.bank;

import java.util.Scanner;

public class BankInterest {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);

		System.out.println("Enter the bank name to know about the interest rate \n SBI\n IDFC \n ICICI");
		String bankNameString = objScanner.next();

		switch (bankNameString) {
		case "SBI":
			System.out.println("SBI intrest rate is 10%");
			break;
		case "IDFC":
			System.out.println("IDFC intrest rate is 20%");
			break;
		case "ICICI":
			System.out.println("ICICI intrest rate is 15%");
			break;
		default:
			System.err.println("NOT A VALID BANK NAME");
			break;
		}
		objScanner.close();
	}

}
