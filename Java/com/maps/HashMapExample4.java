package com.maps;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> objMap = new HashMap<>(15,0.5f);// c = 15 lf = 0.5; 15*0.5;
		objMap.put(1, 1122);
		objMap.put(2, 1123);
		objMap.put(3, 1124);
		objMap.put(4, 1125);
		objMap.put(5, 1126);
		objMap.put(6, 1127);
		objMap.put(7, 1128);
		objMap.put(8, 2322);
		objMap.put(9, 6767);
		
		Iterator<Map.Entry<Integer, Integer>> iterator = objMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) iterator.next();
			System.out.println("K = "+entry.getKey()+" V = "+entry.getValue());
		}
		
		System.out.println(Collections.max(objMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey());
	}

}
