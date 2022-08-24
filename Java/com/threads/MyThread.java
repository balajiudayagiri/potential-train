package com.threads;

public class MyThread extends Thread {
	
	Person objPerson;

	public MyThread(Person objPerson) {
		super();
		this.objPerson = objPerson;
	}
	 public  void run() {
		 try {
			Thread.sleep(500);
			synchronized(objPerson) {
			objPerson.count+=5;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	 
	 

}
