package com.kodnest.java.loopingconstruct;

public class NestedLoop {
	public static void main(String[] args) {
		for (int j=1;j<=5;j++) {
			if(j==2)
				System.out.println("Hello");
			for (int i=1;i<=3;i++) {
				System.out.println(i + " KODNEST");
				if(j==3)
					continue;
				System.out.println("Technologies");
			}
			if(j==4)
				break;
		}
	}
}

