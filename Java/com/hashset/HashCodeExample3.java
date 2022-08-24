package com.hashset;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashCodeExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> objMap = new HashMap<>();
		objMap.put("UDAYAGIRI BALAJI","11-06-1997");//HashCode : 65603, index :
		objMap.put("MUDI MANOHAR","12-10-1994");//HashCode : 101316, index : 
		objMap.put("ITHARAJU SRIKANTH","10-05-1996");
		objMap.put("KANNEBOINA TARUN TEJ","29-08-1995");
		objMap.put("SADU VAMSI KRISHNA","18-06-1994");
		objMap.put("SADU KRISHNA CHAITANYA","23-12-1996");
		objMap.put("MOTTEREDDY CHAITANYA","16-10-1997");
		objMap.put("MALLEPATTU ANVESH","09-11-1992");
		objMap.put("RAGHUVEER BASAVARAJ","25-07-1996");
		System.out.println("map:- "+objMap.size());
		for(Entry<String, String> entry : objMap.entrySet()) {
			Integer hashcodeInteger = entry.getKey().hashCode();
			Integer index =  hashcodeInteger & 15;
			System.out.println("\nhash code:- "+hashcodeInteger+"\nindex:- "+index);
			System.out.println("node present at the given bucket index["+index+"]:- "+entry.getKey());
		}
	}

}
