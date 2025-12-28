package com.java.infosys.selfpractice;

import java.util.Stack;

public class ReversePolishNotation {

	public int evaluateRPN(String arr[]) throws IllegalAccessException {
		Stack<Integer> st = new Stack<>();
		for(String token: arr) {
			if(isOperator(token)) {
				int b = st.pop();
				int a = st.pop();
				int res = applyOperator(a, b, token);
				st.push(res);
			} else {
				st.push(Integer.parseInt(token));
			}
		}
		
		return st.peek();
	}
	
	private int applyOperator(int a, int b, String op) throws IllegalAccessException {
		
		switch(op) {
		case "+": return a+b;
		case "-": return a-b;
		case "*": return a*b;
		case "/": return a/b;
		default: throw new IllegalAccessException("Invalid Operator." +op);
		}
		
	}

	public boolean isOperator(String token) {
		return "+-*/".contains(token);
	}
	
	public static void main(String[] args) throws IllegalAccessException {
		ReversePolishNotation rpn = new ReversePolishNotation();
		
		String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println("Output: " + rpn.evaluateRPN(tokens1));
	}
}
