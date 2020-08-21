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
		System.out.println("�������� ���������� � f() ");
		throw new OneException("from f()");
	}

	public static void main(String[] args) throws TwoException {
		try {
			try {
				f();
			} catch (OneException e) {
				System.out.println("����������� �� ���������� ����� try");
				e.printStackTrace(System.out);
				throw new TwoException("�� ����������� ����� try");
			}
		} catch (TwoException e) {
			System.out.println("����������� �� ������� �����");
			e.printStackTrace(System.out);
		}
	}
}
