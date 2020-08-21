package seven;

class A1 {
	public A1(int s) {
		System.out.println("A1");
	}

	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}

class B1 {
	public B1(int i) {
		System.out.println("B1");// TODO Auto-generated constructor stub
	}

	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}

class C1 {
	public C1(int i) {
		System.out.println("C1");// TODO Auto-generated constructor stub
	}

	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}

class Root {
	Root() {
		System.out.println("Root");
	}

	A1 a = new A1(4);
	B1 b = new B1(4);
	C1 c = new C1(5);
	public void dispose() {
		a.dispose();
		b.dispose();
		c.dispose();
	}
}

public class Stem extends Root {
	public Stem() {
		System.out.println("Stem");// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Stem s = new Stem();
		try {
			// код і обробка зображення
		} finally {
			s.dispose();
		}
	}

	public void dispose() {
		System.out.println("CADSystem dispose()");
		// завершення відбувається у порядку, зворотньому ініціалізації
		super.dispose();
	}
}
