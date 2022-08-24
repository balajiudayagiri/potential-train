package com.nnn;

public class ReturningArrayfromtheMethod {
//	passing data from the static method to the array declaration
	static int[] getArray() {
		return new int[]{1,2,3,4,5};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		passed method data to the declaration
		int arr[] = getArray();
		
		for(int i : arr) {
			System.out.println(i);
		}

	}

}
