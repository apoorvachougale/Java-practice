package com.kodnest.java.loopingconstruct;

public class JumpStatementDemo {
	public static void main(String[] args) {
		for(int i=0; i<=5; i++) {
			if(i==3) {
				return;
			}
			System.out.println(i);
		}
	}
}
