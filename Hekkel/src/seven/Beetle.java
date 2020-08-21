package seven;

class Insect {
	private int i = 9;
	protected int j;

	Insect() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}

	private static int x1 = printInit("поле static Insect.x1 ініціалізовано");

	static int printInit(String s) {
		System.out.println(s);

		return 47;
	}
}

public class Beetle extends Insect {
	private int k = printInit("поле Beetle.k ініціалізовано");

	public Beetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}

	private static int x2 = printInit("поле static Beetle.x2 ініціалізовано");

	public static void main(String[] args) {
		System.out.println("конструктор Beetle");
		Beetle b = new Beetle();
	}
}


