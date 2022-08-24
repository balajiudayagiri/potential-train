package com.businessexcption;

public class UserIdMissMatchException extends Exception{
	/**
	 * custom Exception or user defined Exception or business Exception
	 */
	private static final long serialVersionUID = -5722950143792331578L;

	public UserIdMissMatchException(String str) {
		super(str);
	}
}
