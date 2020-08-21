package seven;

class A {
	public A() {
		System.out.println("A");
	}
}

class B {
	public B() {
		System.out.println("B");// TODO Auto-generated constructor stub
	}
}

public class C extends A {
	public C() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
	}

}
