package com.businessexcption;

public class DeptNotMatchException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5080704396271778787L;

	public DeptNotMatchException(String str) {
		super(str);
	}
}
