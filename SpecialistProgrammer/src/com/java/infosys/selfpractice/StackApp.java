package com.java.infosys.selfpractice;

public class StackApp {
	public static void main(String[] args) {
		StackInBigOofOne st = new StackInBigOofOne();
		
		st.push(-2);
		st.push(0);
		st.push(-3);
		
		System.out.println(st.getMin());
		st.pop();
		
		System.out.println(st.top());
		
		System.out.println(st.getMin());
		
	}
}
