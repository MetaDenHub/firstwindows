package ten;
/*
 * 
 * extending inner classes
 * 
 * */

class Classs {
	class Cl {
		public Cl(int i) {

		}
	}

	void f() {
		System.out.println("f() classes");
	}
}

public class InnerClasses extends Classs {
	void f() {
		System.out.println("f()");
	}

	class Cl2 extends Classs.Cl {

		public Cl2(Classs c, int i) {
			c.super(i);
		}
	}

	public static void main(String[] args) {
		Classs c = new InnerClasses();
		c.f();
	}
}
