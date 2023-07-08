package acme.execution.util;

public class mytest {

	public static void main(String[] args) {
		String aString = "a + (my_expr);";
		String bString = "a + b + c + (d^2 - e * f);";
		
		System.out.println(aString.replace("my_expr", bString));
		System.out.println(aString);
	}
}
