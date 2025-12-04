package com.java.mainmethod.intro;

public class MainMethodIntro {
	public static void main(String[] args) {
	int arr[] = {1,2,3,4,5};
	
	MainMethodIntro.arrElements(arr);
}
	
	public static void arrElements(int args[]) {
		int sum = 0;
		for(int i=0; i<args.length; i++) {
			sum += args[i];
		}
		System.out.println("Sum is: " + sum);
	}
}
