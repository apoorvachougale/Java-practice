package com.java.racecondition.demo;

public class MSWord extends Thread{
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("type")) {
			typing();
		} else if(name.equals("autoSave")) {
			autoSaving();
		} else {
			spellChecking();
		}
	}
	public void typing() {
		for(int i=0; i<5; i++) {
		System.out.println("TYPING......");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	
	public void spellChecking() {
		while(true) {
		System.out.println("Spelling is getting checked...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	
	public void autoSaving() {
		
		while(true) {
		System.out.println("Auto saving....");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
