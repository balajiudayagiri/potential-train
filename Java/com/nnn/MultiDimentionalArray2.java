package com.nnn;

public class MultiDimentionalArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr =  {{1,2,3,4},{4,5,6},{2,3,7,8,9}};
		
//	   _|__________
//		|1 2 3 4
//		|4 5 6
//		|2 3 7 8 9
		
		System.out.println(arr.length);
		System.out.println();
		
		for(int i = 0; i<arr.length;i++) {
			
			for(int j = 0;j<arr[i].length;j++) {
			
				System.out.print(arr[i][j]+" ");
			
			}
			System.out.println();
		}
	}

}
