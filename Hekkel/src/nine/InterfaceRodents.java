package nine;
interface Rodentt {

	int refcount = 0;
	static long counter = 0;
	final long id = 0;

	String s = "rodent";

	public void eat();

	public void sleeping();
	public void dispose();

	public String toString();
}

class Mousee implements Rodentt {
	String s = "mouse ";

	public Mousee() {
		System.out.println("Mouse() " + s );// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Mouse eating.. ");
	}

	public void sleeping() {
		System.out.println("Mouse sleeping.. ");
	}

	public String toString() {
		return "Mouse " + id;
	}

	public void dispose() {
		System.out.println("dispose()");
	}
}

class Hamsterr implements Rodentt {
	static String s = "ham-hamster ";

	public Hamsterr() {
		System.out.println("Hamster() " + s);// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Hamster eating.. ");
	}

	public void sleeping() {
		System.out.println("Hamster sleeping.. ");
	}

	public String toString() {
		return "Hamster " + id;
	}

	public void dispose() {
		System.out.println("dispose");
	}
}

class Marmott implements Rodentt {
	String s = "marmot ";

	public Marmott() {
		System.out.println("Marmot() " + s);// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Marmot eating.. ");
	}

	public void sleeping() {
		System.out.println("Marmot sleeping.. ");
	}

	public void dispose() {
		System.out.println("dispose");
	}

	public String toString() {
		return "Marmot " + id;
	}
}

public class InterfaceRodents {
	public InterfaceRodents() {
		System.out.println("Rodents()");// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Rodentt[] rds = { new Hamsterr(), new Hamsterr(), new Marmott(), new Mousee() };
		eat(rds);
		for (Rodentt rodent : rds) {
			rodent.dispose();
		}
	}

	private static void eat(Rodentt[] rds) {
		for (Rodentt rodent : rds) {
			rodent.eat();
			rodent.sleeping();
		}
		System.gc();
	}
}
