package com.arrays;

import java.util.Arrays;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] a = {{{1,2,3,4},{3,5,4},{2,4,3,5}},{{1,2,3},{4,5,6,5}}};
		
		System.out.println(a.length);
		System.out.print(a[0].length+" ");
		System.out.println(a[1].length);
		System.out.print(a[0][0].length+" ");
		System.out.print(a[0][1].length+" ");
		System.out.print(a[1][0].length+" ");
		System.out.println(a[1][1].length);
		System.out.println();

		for(int[][] x : a) {
			for(int[] y : x) {
				for(int z : y) {
					System.out.print(z+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
        System.out.println(Arrays.deepToString(a));
	}

}
