package com.list.arraylist;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> inputList = new ArrayList<>();
		LinkedHashMap<String, ArrayList<String>> objMap = new LinkedHashMap<>();
//		we are instance of that class for using get method to give a list as a value 
		objMap.put("d1", new ArrayList<>());
		objMap.put("d2", new ArrayList<>());
		objMap.put("d3", new ArrayList<>());
		objMap.put("d4", new ArrayList<>());
		objMap.put("d5", new ArrayList<>());
		objMap.put("d7", new ArrayList<>());
//		use get() method for accessing the key value and add() method for adding data into the list
		objMap.get("d1").add("e1");
		objMap.get("d2").add("e2");
		objMap.get("d1").add("e3");
		objMap.get("d3").add("e4");
		objMap.get("d7").add("e5");
		objMap.get("d4").add("e6");
		objMap.get("d5").add("e7");
		objMap.get("d7").add("e8");
		objMap.get("d1").add("e9");
		objMap.get("d2").add("e10");
		
		System.out.println(objMap);
	}

}
