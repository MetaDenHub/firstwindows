package five;

public class Dog {
	void bark(boolean b, int i) {
		System.out.println("BARK!");
	}
	void bark(int i, boolean b) {
		System.out.println("BARK!");
	}
	void bark(boolean b) {
		System.out.println("BARK!");
	}
	void vooo(char ch) {
		System.out.println("VOOOO!");
	}
	void uuuu(int i) {
		System.out.println("uuuu");
	}
	void rrr(short sh) {
		System.out.println("RRRR!");
	}
	void mmm(long l) {
		System.out.println("scr!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.bark(true, 2);
		dog.bark(4, true);
		dog.bark(true);
		dog.vooo('q');
		dog.uuuu(1);
		dog.rrr((short)3);
		dog.mmm(56l);
	}
	

}
