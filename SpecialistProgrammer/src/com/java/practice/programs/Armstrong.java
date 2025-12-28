package com.java.practice.programs;

import java.util.Scanner;
	public class Armstrong {
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int startVal = sc.nextInt();
	        int endVal = sc.nextInt();
	        for(int i=startVal; i<=endVal; i++) {
	            int res = armstrongNumber(i);
	            if(res==i){
	                System.out.print(res+" ");
	            }
	        }
	    }

	    public static int armstrongNumber(int num) {
	        int digitCount = String.valueOf(num).length();
	        double res = 0;
	        while(num>0) {
	            int digit = num%10;
	            res = Math.pow(digit, digitCount);
	            num = num/10;
	        }
	        return (int) res;
	    }
}
