package ten;

/*
 * 
 * adding removing elements in massive 
 * 
 * */

interface U {
	void a();

	void b();

	void c();
}

class A {
	U toU() {
		return new U() {
			@Override
			public void a() {
				System.out.println("a()");
			}

			@Override
			public void b() {
				System.out.println("b()");
			}

			@Override
			public void c() {
				System.out.println("c()");
			}
		};
	}
}

class B {
	U[] uu = new U[5];

	void addMassive(int i, U u) {
		uu[i] = u;
	}

	void removeMassive(int i, U u) {
		uu[i] = null;
	}

	void callMassive() {
		for (U u : uu) {
			if (u == null)
				continue;
			u.a();
			u.b();
			u.c();
		}
	}
}

public class TweOne {

	public static void main(String[] args) {
		A aa = new A();
		A aaa = new A();
		B bb = new B();
		bb.addMassive(0, aa.toU());
		bb.addMassive(1, aaa.toU());
		bb.addMassive(2, aaa.toU());
		bb.addMassive(3, aaa.toU());
		bb.addMassive(4, aaa.toU());
		bb.removeMassive(2, aa.toU());
		bb.callMassive();
	}

}
