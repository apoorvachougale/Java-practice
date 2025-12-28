package com.java.threads;

public class AdditionActivity extends Thread{
  @Override
  public void run() {
	int a = 10;
	int b = 20;
	System.out.println("Addition is: " +(a+b));
}
}
