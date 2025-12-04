package com.java.mainmethod.intro;

public class ArraySum{
	
	public  static void main(String... args) {
		int sum =0;
		for(int i=0; i<args.length; i++) {
			 System.out.println(args[i]+ " ");
			 sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println("Sum of array elements is: " + sum);
		
	}
	
	//we cannot make class as protected we will get an error
//	protected static void main(int [] args) {
//		AddNum addition = new AddNum();
//		addition.add();
//	}
	
	//question-10 -> answer is no, we will get an error
//	public static void main(int [] args) {
//		for(int i=0; i<args.length; i++) {
//			 System.out.println(args[i]+ " ");
//		}
//	}
}



// 1. Yes we can have main method in abstract class.
// 2. yes we can have main method in the interface
//3. Yes it can be overloaded
//4. Yes the main method can be inherited
//5. We cannot override main method, because of static modifier
//6.Main method can make it final
//7. Abstract class cannot have abstract main method
//8. we cannot make class as protected we will get an error
//9. Yes it can have String ... [it means variable number of arguments]
//10. Main method return type cannot be changed and cannot return any value