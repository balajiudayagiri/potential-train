package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<EmployeeData> objList = new ArrayList<>();
		objList.add(new EmployeeData("Udayagiri", "Balaji", "Benglore", 25, 9876));
		objList.add(new EmployeeData("Urabandi", "ManiPavan", "vijayawada", 23, 9875));
		objList.add(new EmployeeData("Itaraju", "Srikanth", "nalgona", 26, 9874));
		objList.add(new EmployeeData("Mudi", "Manohar", "nellore", 27, 9873));
		objList.add(new EmployeeData("Mottireddy", "Chaithanya", "nellore", 24, 9872));

		List<?> objList2 = objList.stream().filter(a -> a.age < 25).map(a -> a.firstName)
				.collect(Collectors.toList());
		System.out.println(objList2);
	}

}
