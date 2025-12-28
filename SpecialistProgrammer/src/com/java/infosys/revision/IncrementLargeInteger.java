package com.java.infosys.revision;
import java.util.*;

public class IncrementLargeInteger {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // Write your code here...
	        int n = scanner.nextInt();
	        int arr[] = new int[n];
	        for(int i=0; i<n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        int res[] = plusOne(arr);
	        for(int i=0; i<res.length; i++) {
	            System.out.print(res[i]+ " ");
	        }
	    }

	    public static int[] plusOne(int[] digits) {
	        int num = digits[digits.length-1];

	        
	        if(num<9){
	           digits[digits.length-1] = num+1;
	        } else {
	            String str = "";
	            for(int i=0; i<digits.length; i++) {
	            	str = str + digits[i];
	            }
	            
	            
	            int number = Integer.parseInt(str);
	            number +=1;
	            String s = String.valueOf(number);
	            int res[] = new int[s.length()];
	            for(int i=0; i<s.length(); i++) {
	            	res[i] = s.charAt(i) - '0';
	            }
	            return res;
	        }
	        return digits;
	}
}
