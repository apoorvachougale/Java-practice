package com.java.array.intro;
import java.util.Scanner; class EvenNumbersFromTwoArrays {
 public static void main(String[] args) {
	 
	         Scanner scanner = new Scanner(System.in);
	         
	         int arr1[] = new int[scanner.nextInt()];
	         for(int i=0; i<arr1.length; i++) {
	             arr1[i]= scanner.nextInt();
	         }
	         
	         int arr2[] = new int[scanner.nextInt()];
	         for(int i=0; i<arr2.length; i++) {
	             arr2[i] = scanner.nextInt();
	         }
	         
	         int res[] = new int[arr1.length + arr2.length];
	         int k=0;
	         for(int i=0; i<=arr1.length-1; i++){
	                 if(arr1[i]%2 == 0) {
	                     res[k++] = arr1[i];
	                 }
	         }
	         for(int i=0; i<=arr2.length-1; i++) {
	             if(arr2[i] % 2 == 0) {
	                 res[k++] = arr2[i];
	             }
	         }
	       
	         System.out.print("Even Numbers Array: [");
	         for(int i=0; i<k; i++) {
	             System.out.print(res[i]);
	             if(i != k-1) {
	                 System.out.print(", ");
	             }
	         }
	         System.out.println("]");
	         scanner.close();
}
}
