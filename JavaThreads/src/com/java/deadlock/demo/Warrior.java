package com.java.deadlock.demo;

public class Warrior extends Thread{
	
	String res1 = "sarpastra";
	String res2 = "garudastra";
	String res3 = "pashupatastra";
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("arjuna")) {
			arjunaAcquireResource();
		} else {
			karnaAcquireResource();
		}
	}
	
	public void karnaAcquireResource() {
		try {
			Thread.sleep(3000);
			synchronized (res1) {
				System.out.println(Thread.currentThread().getName()+ " has aquired resource " +res1);
				Thread.sleep(3000);
				synchronized (res2) {
					System.out.println(Thread.currentThread().getName()+ " has aquired resource " +res2);
					Thread.sleep(3000);
					synchronized (res3) {
						System.out.println(Thread.currentThread().getName()+ " has aquired resource " +res3);
						Thread.sleep(3000);
					}
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void arjunaAcquireResource() {
		try {
			Thread.sleep(3000);
			synchronized (res3) {
				System.out.println(Thread.currentThread().getName()+ " has aquired resource " +res3);
				Thread.sleep(3000);
				synchronized (res2) {
					System.out.println(Thread.currentThread().getName()+ " has aquired resource " +res2);
					Thread.sleep(3000);
					synchronized (res1) {
						System.out.println(Thread.currentThread().getName()+ " has aquired resource " +res1);
						Thread.sleep(3000);
					}
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
