package ten;

public class TestInner {

	private static int i = 5;
	private void fff() {
		System.out.println("fff");
	}
	
	class Inner {
		void sss() {
			TestInner.this.i = 8;
			TestInner.this.fff();
		}
		private int aa=9;
	}
	
	static void toInner() {
		TestInner inner = new TestInner();
		Inner in = inner.new Inner();
		in.sss();
		System.out.println(in.aa);
	}
	
	public static void main(String[] args) {
		toInner();
		System.out.println(i);
	}

}
