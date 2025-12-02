package com.java.oopconcepts;

public class PgApp {
	public static void main(String[] args) {
		PgDetails pd;
		pd = new PgDetails();
		
		pd.pgId = 1;
		pd.pgName = "Perfect ladies PG ";
		pd.pgAddress = "2nd stage btm layout. ";
		pd.customerName = "Apoorva";
		
		pd.accomodateCustomer();
		pd.pgServices();
	}
}
