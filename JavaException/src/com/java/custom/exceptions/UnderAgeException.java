package com.java.custom.exceptions;

public class UnderAgeException extends Exception {
	
	@Override
	public String getMessage() {
		
		return "Age below 18 are not allowed to open an account in matrimoney....";
	}
}
