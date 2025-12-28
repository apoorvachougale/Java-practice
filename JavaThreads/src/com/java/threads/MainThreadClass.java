package com.java.threads;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MainThreadClass {
	public static void main(String[] args) {
		System.out.println("Main method execution started");
		Activity t1 = new Activity();
		Activity t2 = new Activity();
		Activity t3 = new Activity();
		
		t1.setName("bank");
		t2.setName("add");
		t3.setName("print");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		System.out.println("Main method completed");
		
	}
}
