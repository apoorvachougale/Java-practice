package com.java.producerconsumer.problem;

public class Producer implements Runnable{

	Factory factory = new Factory();
	
	
	public Producer(Factory factory) {
		this.factory = factory;
	}

	@Override
	public void run() {
		int a =1;
		while(true) {
			try {
				factory.setData(a++);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
