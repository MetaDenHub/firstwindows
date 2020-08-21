package nine;

/*
 * 
 * solving rhombus problem by using interfaces
 * 
 * */

public interface A {
	void a();

	void a(int i);
}

interface B extends A {
}

interface C extends A {
	void a(int i, int s);
}

interface D extends B, C {

}

class KJK implements D {

	@Override
	public void a() {
		// TODO Auto-generated method stub

	}

	@Override
	public void a(int i) {
		// TODO Auto-generated method stub

	}

	@Override
	public void a(int i, int s) {
		// TODO Auto-generated method stub

	}

}