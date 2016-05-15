package nishantshinde.ocp7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {

	public static void main(String[] args) {
		// test1();
		// test2();
		// test3();
		// test4();
		test5();
	}

	private static void test5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("scanner.nextInt() - " + scanner.nextInt()); // Can result in java.util.InputMismatchException
	}

	private static void test4() {
		// String pattern = "\\d\\d\\d";
		String pattern = "\\d+";
		String input;
		Matcher m;
		Pattern p = Pattern.compile(pattern);

		input = "12345";
		m = p.matcher(input);
		System.out.println("\"" + input + "\" matches \"" + pattern + "\" : " + m.matches());
		System.out.println("find() - " + m.find());

		input = "123";
		m = p.matcher(input);
		System.out.println("\"" + input + "\" matches \"" + pattern + "\" : " + m.matches());
		System.out.println("find() - " + m.find());

		input = "123.123.456.789";
		m = p.matcher(input);
		System.out.println("\"" + input + "\" matches \"" + pattern + "\" : " + m.matches());
		boolean found;
		// System.out.println("start() - " + m.start()); //
		// java.lang.IllegalStateException: No match available
		for (int i = 0; i < 5; i++) {
			System.out.println("find() - " + i + " " + (found = m.find()));
			if (found) {
				System.out.println("start() - " + m.start());
				System.out.println("group() - " + m.group()); // Equivalent to
																// input.substring(m.start(),
																// m.end())
			}
		}
	}

	private static void test3() {
		int max = 3;
		System.out.println("for (int i = 0; ++i < " + max + ";)");
		for (int i = 0; ++i < max;) {
			System.out.println(i);
		}

		System.out.println("\nfor (int i = 0; i++ < " + max + ";)");
		for (int i = 0; i++ < max;) {
			System.out.println(i);
		}

		System.out.println("\nfor (int i = " + max + "; --i > 0;)");
		for (int i = max; --i > 0;) {
			System.out.println(i);
		}

		System.out.println("\nfor (int i = " + max + "; i-- > 0;)");
		for (int i = max; i-- > 0;) {
			System.out.println(i);
		}

		System.out.println("\nfor(X;Y;Z)A; ");
		System.out.println("\n IS SAME AS \n");
		System.out.println("X ");
		System.out.println("while(Y){");
		System.out.println("\tA;");
		System.out.println("\tZ;");
		System.out.println("}");
	}
	
	private static void test2() {

		int N = 77777777;
		long t;

		{
			StringBuffer sb = new StringBuffer();
			t = System.currentTimeMillis();
			for (int i = N; i-- > 0;) {
				sb.append("");
			}
			System.out.println(System.currentTimeMillis() - t);
		}

		{
			StringBuilder sb = new StringBuilder();
			t = System.currentTimeMillis();
			for (int i = N; i-- > 0;) {
				sb.append("");
			}
			System.out.println(System.currentTimeMillis() - t);
		}
	}
	
	private static void test1() {

		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(5);
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);

		list1.remove(2);
		list1.remove(new Integer(2));

		System.out.println(list1);
	}

}
