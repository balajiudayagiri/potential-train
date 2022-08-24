package com.maps;

import java.util.HashMap;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> objMap = new HashMap<>();
		objMap.put(1, "UDAYAGIRI BALAJI");//hashcode : 65603, index :
		objMap.put(2, "URABANDI MANIPAVAN");//hashcode : 98342, index : 
		objMap.put(3, "MUDI MANOHAR");//hashcode : 101316, index : 
		objMap.put(4, "ITHARAJU SRIKANTH");
		objMap.put(5, "KANNEBOINA TARUN TEJ");
		objMap.put(6, "SADU VAMSI KRISHNA");
		objMap.put(7, "SADU KRISHNA CHAITANYA");
		objMap.put(8, "MOTTEREDDY CHAITANYA");
		objMap.put(9, "MALLEPATTU ANVESH");
		objMap.put(10, "RAGHUVEER BASAVARAJ");
		System.out.println("map:- "+objMap.size());
		for (int i=1;i<=objMap.size();i++) {
			Integer hashcodeInteger = objMap.get(i).hashCode();
			Integer index =  hashcodeInteger & 15;
			System.out.println("\nhash code:- "+hashcodeInteger+"\nindex:- "+index);
			System.out.println("node present at the given bucket index["+index+"]:- "+objMap.get(i));
		}
		System.out.println();
		
		
	}

}
