package com.threads;

public class Example11 extends Thread {

	@Override
	public void run() {
		System.out.println("thread from Example11 .....");
	}

	public static void main(String[] args) {
		Example11 objExample111 = new Example11();
		Example11 objExample112 = new Example11();
		Example11 objExample113 = new Example11();

		System.out.println("Priority of objExample111 : " + objExample111.getPriority());
		System.out.println("Priority of objExample112 : " + objExample112.getPriority());
		System.out.println("Priority of objExample113 : " + objExample113.getPriority());

		objExample111.setPriority(MAX_PRIORITY);//10
		objExample112.setPriority(MIN_PRIORITY);//1
		objExample113.setPriority(NORM_PRIORITY);//5

		System.out.println("Priority of objExample111 After setting priority : " + objExample111.getPriority());
		System.out.println("Priority of objExample112 After setting priority : " + objExample112.getPriority());
		System.out.println("Priority of objExample113 After setting priority : " + objExample113.getPriority());

	}
}
