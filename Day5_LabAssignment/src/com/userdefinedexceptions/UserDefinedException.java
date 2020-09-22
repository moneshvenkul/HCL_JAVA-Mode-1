package com.userdefinedexceptions;

public class UserDefinedException extends Exception {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	String message;

	public UserDefinedException(String message) {
		super(message);
		this.message = message;
	}

}
