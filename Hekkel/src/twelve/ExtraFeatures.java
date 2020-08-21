package twelve;

class MyException2 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x;

	public MyException2() {

	}

	public MyException2(String msg) {
		super(msg);
	}

	public MyException2(String msg, int x) {
		super(msg);
		this.setX(x);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int val() {
		return x;
	}

	@Override
	public String getMessage() {
		return "Подробное сообщение: " + x + " " + super.getMessage();
	}

}

public class ExtraFeatures {
	public static void f() throws MyException2 {
		System.out.println("возбуждаем  ExtraFeatures из f() ");
		throw new MyException2();
	}

	public static void g() throws My1 {
		System.out.println("возбуждаем  ExtraFeatures из g() ");
		throw new My1("создано в g()");
	}

	public static void h() throws MyException2 {
		System.out.println("возбуждаем  ExtraFeatures из h() ");
		throw new MyException2("создано в h()", 47);
	}

	public static void main(String[] args) {
		try {
			f();
		} catch (MyException2 e) {
			e.printStackTrace(System.out);
		}
		try {
			g();
		} catch (My1 e) {
			e.printStackTrace(System.out);
		}
		try {
			h();
		} catch (MyException2 e) {
			e.printStackTrace(System.out);
			System.out.println("e.val() = " + e.val());
		}
	}
}

////////////     1     /////////////

class My1 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x;

	public My1() {

	}

	public My1(String msg) {
		super(msg);
	}

	public My1(String msg, int x) {
		super(msg);
		this.setX(x);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int val() {
		return x;
	}

	@Override
	public String getMessage() {
		return "Мой класс-исключение1: " + x + " " + super.getMessage();
	}

}

/////////////    2    ///////////
class My2 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x;

	public My2() {

	}

	public My2(String msg) {
		super(msg);
	}

	public My2(String msg, int x) {
		super(msg);
		this.setX(x);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int val() {
		return x;
	}

	@Override
	public String getMessage() {
		return "Мой класс-исключение2: " + x + " " + super.getMessage();
	}

}
