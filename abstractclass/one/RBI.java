package com.abstractclass.one;

import com.interfaceexamples.*;

public abstract class RBI extends WorldBank implements A,B{
	public abstract void intrestRates();
	public abstract void noOfAccunts();
	public void label2() {
		System.out.println("RBI class");
	}
	public void label1() {
		System.out.println("WorldBank class override");
	}
}
