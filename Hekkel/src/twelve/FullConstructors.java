package twelve;

class MyException extends Exception {
	public MyException() {
		
	}
	public MyException(String msg) {
		super(msg);
	}
}

public class FullConstructors {
	public static void f() throws MyException {
		System.out.println("Возбуждаем MyException из f()");
		throw new MyException();
	}
	
	public static void g() throws MyException {
		System.out.println("MyExc from g()");
		throw new MyException("called from g()");
	}
	
	public static void main(String[] args) {
		try {
			f();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			g();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
	}
	
}
