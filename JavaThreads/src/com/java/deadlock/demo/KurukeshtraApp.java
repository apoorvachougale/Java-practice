package com.java.deadlock.demo;

public class KurukeshtraApp {
	public static void main(String[] args) {
		Warrior t1 = new Warrior();
		Warrior t2 = new Warrior();
		
		t1.setName("arjuna");
		t2.setName("karna");
		
		t1.start();
		t2.start();
	}
}
