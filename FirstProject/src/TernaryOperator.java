
public class TernaryOperator {
	public static void main(String[] args) {
		var a = 10;
		var b = 20;
		int age = 20;
		var c = ((a<b) ? "True" : "False");
		System.out.println(c);
		System.out.println((a>b)? "A is greater" : "B is greater");
		System.out.println((age>18)? "Eligible for voting": "Not eligible for voting");
	}
}
