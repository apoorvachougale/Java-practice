package com.java.oopconcepts;

public class PgDetails {
		int pgId;
		String pgName;
		String pgAddress;
		String customerName;
		
		void accomodateCustomer() {
			System.out.println(pgName+ " will accomodate the customer " +customerName);
		}
		void pgServices() {
			System.out.println(pgName+ " provides services to the customer " +customerName);
		}
		
}
