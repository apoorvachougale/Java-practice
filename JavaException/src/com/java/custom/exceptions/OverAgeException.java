package com.java.custom.exceptions;

public class OverAgeException extends Exception {
	@Override
	public String getMessage() {
		
		return "Age above 40 are not allowed to open an account in matrimoney....";
	}
}
