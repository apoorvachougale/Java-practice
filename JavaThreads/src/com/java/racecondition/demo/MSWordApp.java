package com.java.racecondition.demo;

public class MSWordApp {
	public static void main(String[] args) {
		MSWord t1 = new MSWord();
		MSWord t2 = new MSWord();
		MSWord t3 = new MSWord();
		
		t1.setName("type");
		t2.setName("autoSave");
		t3.setName("spellCheck");
		
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
}
}
