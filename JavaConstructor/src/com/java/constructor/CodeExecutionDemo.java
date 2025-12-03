package com.java.constructor;

public class CodeExecutionDemo {
	public static void main(String[] args) {
		
		CodeExecution.staticMethod();
		CodeExecution cd = new CodeExecution();
		cd.instanceMethod();
	}
}
