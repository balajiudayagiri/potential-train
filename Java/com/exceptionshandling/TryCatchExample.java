package com.exceptionshandling;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a = new int[2];
			a[0]=10;
			a[2] = 20;
			System.out.println(a[0]+""+a[2]);
		} catch (Exception e) {
			// TODO: handle exception
			int[] a = new int[2];
			a[0]=10;
			a[1]=20;
			System.out.println(a[0]+" "+a[1]);
		}
	}

}
