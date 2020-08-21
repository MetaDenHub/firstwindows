package five;

public class ThisInConstructors {
	int petalCount = 0;
	String s = "initial value";

	ThisInConstructors(int petals) {
		petalCount = petals;
		System.out.println("����������� � ���������� int, petalCount = " + petalCount);
	}

	ThisInConstructors(String ss) {
		System.out.println("����������� � ���������� String, ss = " + ss);
		s = ss;
	}

	ThisInConstructors(String s, int petals) {
		this(petals);
		this.s = s;
		System.out.println("��������� String � int");
	}
	
	public ThisInConstructors() {
		this("hi", 47);
		System.out.println("����������� �� ���������(��� ����������)");
	}
	
	void printPetalCount() {
		System.out.println("PetalCOunt ="+ petalCount+" s = "+s);
	}

	public static void main(String[] args) {
		ThisInConstructors x = new ThisInConstructors();
		x.printPetalCount();
	}

}
