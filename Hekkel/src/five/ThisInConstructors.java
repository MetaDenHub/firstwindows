package five;

public class ThisInConstructors {
	int petalCount = 0;
	String s = "initial value";

	ThisInConstructors(int petals) {
		petalCount = petals;
		System.out.println("Конструктор с параметром int, petalCount = " + petalCount);
	}

	ThisInConstructors(String ss) {
		System.out.println("конструктор с параметром String, ss = " + ss);
		s = ss;
	}

	ThisInConstructors(String s, int petals) {
		this(petals);
		this.s = s;
		System.out.println("Аргументи String і int");
	}
	
	public ThisInConstructors() {
		this("hi", 47);
		System.out.println("конструктор по умолчанию(без аргументов)");
	}
	
	void printPetalCount() {
		System.out.println("PetalCOunt ="+ petalCount+" s = "+s);
	}

	public static void main(String[] args) {
		ThisInConstructors x = new ThisInConstructors();
		x.printPetalCount();
	}

}
