package nishantshinde.ocp7;

public class Chapter11 {

	public static void main(String[] args) {

//		test1();
		test2();
		
	}
	
	private static void test2() {
		Integer i1 = 100; // NOTE: LESS than 127
		Integer i2 = 100; // NOTE: LESS than 127
		Integer i3 = 1000; // NOTE: More than 127
		Integer i4 = 1000; // NOTE: More than 127
		
		if(i1 != i2) System.out.println("Autobox ("+i1+","+i2+") - Different objects");
		if(i1 == i2) System.out.println("Autobox ("+i1+","+i2+") - Same object");

		if(i3 != i4) System.out.println("Autobox ("+i3+","+i4+") - Different objects");
		if(i3 == i4) System.out.println("Autobox ("+i3+","+i4+") - Same object");

		Integer i5 = new Integer(100);
		Integer i6 = new Integer(100);
		if(i5 == i6) System.out.println("Integer object ("+i5+","+i6+") - Same object");
		if(i5 != i6) System.out.println("Integer object ("+i5+","+i6+") - Different objects");

		
	}

	private static void test1() {
		
		EqualsTest object1 = new EqualsTest();
		EqualsTest object2 = new EqualsTest();
		EqualsTest subclassObject1 = new EqualsTestSubclass();
		
		String string1 = "";
		
		System.out.println(object1.equals(object2));
		System.out.println(object1.equals(subclassObject1));
		System.out.println(object1.equals(string1));

	}

	public static class EqualsTest {
		public boolean equals(EqualsTest other) {
			return true;
		}
	}

	public static class EqualsTestSubclass extends EqualsTest {
		// NOTE: Overloading not overriding
		public boolean equals(EqualsTest other) {
			return true;
		}
	}

}
