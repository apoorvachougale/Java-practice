package com.java.custom.exceptions;

public class KodnestMatrimoney {
	void initiate() {
		Applicant ap = new Applicant();
		try {
		ap.validate();
		} catch(Exception e) {
			System.out.println("Issue reached kodnest matrimoney....");
			e.printStackTrace();
		}
	}
}
