package twelve;

class OneException extends Exception {
	public OneException(String s) {
		super(s);
	}
}

class TwoException extends Exception {
	public TwoException(String s) {
		super(s);
	}
}

public class RethrowNew {
	public static void f() throws OneException {
		System.out.println("создание исключения в f() ");
		throw new OneException("from f()");
	}

	public static void main(String[] args) throws TwoException {
		try {
			try {
				f();
			} catch (OneException e) {
				System.out.println("перехвачено во внутреннем блоке try");
				e.printStackTrace(System.out);
				throw new TwoException("из внутреннего блока try");
			}
		} catch (TwoException e) {
			System.out.println("перехвачено во внешнем блоке");
			e.printStackTrace(System.out);
		}
	}
}
