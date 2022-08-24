package com.maps;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> objMap = new TreeMap<>();
//		adds data according to the 'key' 
		objMap.put(4, "vamsy");
		objMap.put(3, "srikanth");
		objMap.put(1, "balaji");
		objMap.put(5, "chaithanya");
		objMap.put(2, "manohar");
		objMap.put(6, "manohar");
		for(Integer x : objMap.keySet()) {
			System.out.println(objMap.get(x));
		}
	}

}
