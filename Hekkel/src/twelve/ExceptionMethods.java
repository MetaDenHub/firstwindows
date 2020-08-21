package twelve;

class Exception1 extends Exception {
	public Exception1() {}
	public Exception1(String str) {
		super(str);
	}
	@Override
	public String getMessage() {
		return "My Exception 1 " + super.getMessage();
	}
}

class Exception2 extends Exception {
	String str;

	public Exception2() {

	}

	public Exception2(String str) {
		super(str);
		this.str = str;
	}

	public Exception2(String str, int s) {
		super(str);
		this.str = str;
	}

	@Override
	public String getMessage() {
		return "My Exception 2 " + super.getMessage();
	}
}

class Exception3 extends Exception {
int x;
String str;
	public Exception3() {
		
	}
public Exception3(String str, int x) {
	super(str);
	this.str = str;
	x = x;
}
@Override
	public String getMessage() {
		return "My Exception 3 " + super.getMessage();
	}
}

public class ExceptionMethods {
	static void killIt() throws Exception1, Exception2, Exception3 {
		
			throw new Exception1();
		
		

	}

	public static void main(String[] args) {
		try {
			throw new Exception("My Exception =)");
		} catch (Exception e) {
			System.out.println("Catching!");
			System.out.println("getMessage(): " + e.getMessage());
			System.out.println("getLocalizedMessage(): " + e.getLocalizedMessage());
			System.out.println("toString(): " + e);
			System.out.print("printStackTrace(): ");
			e.printStackTrace(System.out);
		}
		System.out.println("__________________________________________");
		try {
			killIt();
		} catch (Exception1 | Exception2 | Exception3 e) {
			e.printStackTrace(System.out);
		}
	}
}
