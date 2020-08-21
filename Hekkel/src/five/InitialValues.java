package five;

public class InitialValues {
	boolean b;
	int i;
	char ch;
	byte bt;
	short sh;
	long l;
	float f;
	double d;
	InitialValues reference;

	/**
	 * 
	 */
	void printInitialValues() {
		System.out.println(b);
		System.out.println(i);
		System.out.println(ch);
		System.out.println(sh);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(reference);
	}

	public static void main(String[] args) {
		InitialValues iv = new InitialValues();
		iv.printInitialValues();
	}

}
