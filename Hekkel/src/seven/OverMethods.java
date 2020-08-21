package seven;

class First {
	int hello(int i) {
		return i;
	}

	float hello(float f) {
		return f;
	}

	String hello(String s) {
		return s;
	}
}

public class OverMethods extends First {
	void hello() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverMethods o = new OverMethods();
		o.hello();
		System.out.println(o.hello(6.6f));
		System.out.println(o.hello(5));
		System.out.println(o.hello("HELLO!"));
	}

}
