package com.exceptionhandling;

public class InvalidAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String str) {
		super(str);
	}
}