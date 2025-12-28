package com.java.producerconsumer.problem;

public class Factory {
	int x;
	boolean isProduced=false;	
	synchronized public void setData(int data) throws InterruptedException {
		if(isProduced) {
			wait();
		}
		x = data;
		System.out.println("Producer has produced " +x);
		isProduced = true;
		notify();
	}
	
	synchronized public void getData() throws InterruptedException {
		if(isProduced==false) {
			wait();
		}
		System.out.println("Consumer consumed data: " +x);
		isProduced=false;
		notify();
		
	}

	
}
