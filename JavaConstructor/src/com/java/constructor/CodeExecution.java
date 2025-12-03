package com.java.constructor;

public class CodeExecution {
	static int a;
	
	static {
		a = 100;
		System.out.println("Static variable" +a);
	}
	
	int b;
	
	{
		b = 200;
		a = 222;
		System.out.println("Instance variable " + b+ " " +a);
	}
	static void staticMethod() {
		System.out.println("Static method");
	}
	public void instanceMethod() {
		System.out.println("Instance method");
	}
	
	public CodeExecution() {
		System.out.println("Constructor block executed");
	}
}
