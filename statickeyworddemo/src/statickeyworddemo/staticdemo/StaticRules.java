package statickeyworddemo.staticdemo;

public class StaticRules {
	static int a;
	{
		a = 100;
	}
	static void display1() {
		System.out.println(a);
	}
	int b;
	{
		b=222;
	}
	void display2() {
		System.out.println(b);
	}
	public static void main(String[] args) {
		StaticRules.display1();
		StaticRules d = new StaticRules();
		d.display2();
}
}
