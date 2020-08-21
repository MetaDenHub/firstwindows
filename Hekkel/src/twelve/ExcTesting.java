package twelve;

class TestExc extends Throwable {
	String str = new String();
	public TestExc(String str) {
		this.str = str;
	}
	void prStr() {
		System.out.println(str);
	}
}

public class ExcTesting {

	public static void f() throws MyException {
		System.out.println("Возбуждаем MyException из f()");
		throw new MyException("called from f()");
	}

	public static void g() throws TestExc {
		System.out.println("Возбуждаем MyException из G()");
		throw new TestExc("called from f()");
	}
	
	public static void main(String[] args) {
		
		try {
			g();
		} catch (TestExc e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace(System.out);
		}
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for (int i : arr) {
			try {
				System.out.print(arr[++i] + " ");	
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace(System.out);
			}
			
		}
		
		ExcTesting s = new ExcTesting();
		s = null;
		try {
			s.f();
		} catch (MyException e1) {
			e1.printStackTrace(System.out);
		}
		while(true)
		try {
			f();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		} finally {
			System.out.println("finally");
		}
		
	}
}
