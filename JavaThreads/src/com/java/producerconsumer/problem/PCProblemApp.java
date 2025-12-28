package com.java.producerconsumer.problem;

public class PCProblemApp {
	public static void main(String[] args) {
		Factory factory = new Factory();
		
		Producer p1 = new Producer(factory);
		Consumer p2 = new Consumer(factory);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		t1.start();
		t2.start();
		
	}
}
