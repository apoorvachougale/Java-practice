package com.kodnest.java.numbermanipulation;

public class AbundantNumberLogic {
	public void abundantNum(int n) {
		int sum = 0;
		for (int i=1;i<=n-1;i++) {
			if(n%i==0) {
				sum+= i;
			}
		}
		if(sum>n) {
			System.out.println(n+ " is an abundant number");
		} else {
			System.out.println(n+ " is not an abundant number");
		}
	}
}
