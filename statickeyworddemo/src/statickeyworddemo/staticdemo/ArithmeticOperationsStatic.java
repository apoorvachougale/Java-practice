package statickeyworddemo.staticdemo;

import java.util.Scanner;

public class ArithmeticOperationsStatic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choice: 1. Addition 2. Subtraction 3. Multiplication 4. Division");
		String ops = scan.next();
		System.out.println("Enter 1st number: ");
		int n1 = scan.nextInt();
		System.out.println("Enter 2nd number: ");
		int n2 = scan.nextInt();
		
		switch(ops) {
		case "Addition" -> System.out.println("Addition is: ");
		case "Subtraction" -> System.out.println("Subtraction is: ");
		case "Multiplication" -> System.out.println("Multiplication is: ");
		case "Division" -> System.out.println("Division is: ");
		}	
	}
}
