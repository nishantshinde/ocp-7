package nishantshinde.ocp7;

enum Animals {
	DOG("woof"), CAT("meow"), FISH("burble");
	String sound;

	Animals(String s) {
		sound = s;
	}
}

public class Chapter1Q04 {
	static Animals a;

	public static void main(String[] args) {
		System.out.println(a.DOG.sound + " " + a.FISH.sound);
	}
}
