package com.kodnest.java.numbermanipulation;

public class Prime {
	public boolean primeNum (int n) {
		if(n<=1) {
			 return false;
		} 
		for(int i=2;i<n/2;i++) {
			if (n%i==0) {
				 return false;
			}
		}	 
		return true;
	}
}

//abundant number;
//perfect number;
//friendly pair;
//automorphic number;
//amicable number;
//strong number;
