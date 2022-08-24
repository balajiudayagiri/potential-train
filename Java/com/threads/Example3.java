package com.threads;

public class Example3 {
	public static void main(String[] args) {
		Thread objThread = new Thread("thread balaji");
		new Thread().start();
		System.out.println(objThread.getName());
		
	}
}
