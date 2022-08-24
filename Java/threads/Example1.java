package com.threads;

public class Example1 extends Thread {
	
	public void run() {
		System.out.println("thread is running........Example1");
	}
		
	public static void main(String[] args) {
//		Example1 objExample1 = new Example1();
		new Example1().start();
	}

}
