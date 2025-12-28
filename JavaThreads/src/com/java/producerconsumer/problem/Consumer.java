package com.java.producerconsumer.problem;

public class Consumer implements Runnable{

	Factory factory = new Factory();
	
	public Consumer(Factory factory) {
		this.factory = factory;
	}

	@Override
	public void run() {
		while(true) {
			try {
				factory.getData();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
