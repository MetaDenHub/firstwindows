package ten;

public class Outer {
	int aa;
	private String aaa;
	
	public Outer() {
		aaa = "aaa";
	}
	static Inner innerCl() {
		Outer out = new Outer();
		
		Inner inner = out.new Inner();
		return inner;
	}

	class Inner {
		int i = 2;
		public String toString() {
			return aaa;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner ii = innerCl();
		//ii.i = 9;
		System.out.println(ii.i);
		System.out.println(ii);
	}

}
