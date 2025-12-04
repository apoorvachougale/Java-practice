import java.util.Scanner;

public class TernaryWithUserInput {
	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		String res = (age>18)? "Eligible for voting":"Not eligible for voting";
		System.out.println(res);
	}
}
