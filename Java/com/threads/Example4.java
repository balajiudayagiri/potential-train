package com.threads;

public class Example4 implements Runnable {
	
	public void run() {
		System.out.println("thread is running........Example4");
	}

	public static void main(String[] args) {
		Runnable objRunnable = new Example4();
		Runnable objRunnable2 = new Example2();
		
		Thread objThread = new Thread(objRunnable," Example4...");
		
		objThread.start();
		
		System.out.println(objThread.getName());
	}

}
