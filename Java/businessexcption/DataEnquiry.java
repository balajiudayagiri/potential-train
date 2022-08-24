package com.businessexcption;

import java.util.Scanner;

public class DataEnquiry {


	public static void dataSearch(String name,int id,String dept) throws AdminDataInvalidException,UserIdMissMatchException,DeptNotMatchException {
		if(name.equalsIgnoreCase("admin")) {
			System.out.println("admin verified :)");
		}else {
			try {
				throw new AdminDataInvalidException("access denied :(");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		if(id==1274) {
			System.out.println("id verified :)");
		}else {
			try {
				throw new UserIdMissMatchException("access denied :(");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		if(dept.equals("DEVTEAM")) {
			System.out.println("team member verified :)");
		}else {
			try {
				throw new DeptNotMatchException("access denied :(");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		if (!name.equalsIgnoreCase("admin")&&id!=1274&&!dept.equals("DEVTEAM")) {
			System.err.println("Un-Autherized login attempt");
		}

	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter the username ");
		String string = objScanner.next();
		System.out.println("Enter the userid ");
		int a = objScanner.nextInt();
		System.out.println("Enter the userdept ");
		String string2 = objScanner.next();
		dataSearch(string,a,string2);
		objScanner.close();
	}

}
