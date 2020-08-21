package eight;

class First {
	public void one() {
		two();
	}

	public void two() {
		System.out.println("First.two()");
	}
}

class Second extends First {
	@Override
	public void one() {
		two();
	}

	@Override
	public void two() {
		System.out.println("Sec.two()");
	}
}

public class TwoMethods {
	static First f = new Second();

	public static void main(String[] args) {
		f.one();
	}
}
