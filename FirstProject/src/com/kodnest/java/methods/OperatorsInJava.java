package com.kodnest.java.methods;

public class OperatorsInJava {
	public static void main(String[] args) {
		var a = 20;
		var b = 30;
		boolean c = true;
		boolean d = false;
		System.out.println(a);
		System.out.println(b);
		System.out.println("Arithmetic Operators :");
		System.out.println("Addition operator (+): " +(a+b));
		System.out.println("Subtraction operator (-): " +(a-b));
		System.out.println("Multiplication operator (*): " +(a*b));
		System.out.println("Division operator (/): " +(a/b));
		System.out.println("Modulus operator (%): " +(a%b));
		
		System.out.println("Assignment Operators :");
		System.out.println("Assign value to (=): " +(a=40));
		System.out.println("Plus equal to (+=): " +(b+=1));
		System.out.println("Minus equal to (-=): " +(b-=1));
		
		System.out.println("Comparison Operators: ");
		System.out.println("Equal to (==): " +(a==b));
		System.out.println("Not equal to (!=): " +(a!=b));
		System.out.println("Less than (<): " +(a<b));
		System.out.println("Greater than (>): " +(a>b));
		System.out.println("Less than or equal to (<=): " +(a<=b));
		System.out.println("Greater than or equal to (>=): " +(a>=b));
		
		System.out.println("Logical Operators: ");
		System.out.println("Logical AND (&&): " +(b<a && b>0));
		System.out.println("Logical OR (||): " +(b<a || b>0));
		System.out.println("Logical NOT (!): " +(!true));
		
		System.out.println("Unary Operators: ");
		System.out.println("(++): " +(a++));
		System.out.println("(--): " +(a--));
		System.out.println("(!): " +(!true));
		
		System.out.println("Bitwise Operators: ");
		System.out.println("Bitwise AND (&): " +(c&d));
		System.out.println("Bitwise OR (|): " +(c|d));
		System.out.println("Bitwise XOR (^): " +(c^d) );
		
	}
}
