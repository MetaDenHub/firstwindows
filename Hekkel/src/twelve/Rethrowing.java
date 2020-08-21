package twelve;

//
//
// строка в которой вызываетс€ метод (Exception) e.fillInStackTrace() 
// становитс€ новой точкой происхождени€ исключени€
//

public class Rethrowing {
	public static void f() throws Exception {
		System.out.println("создание исключени€ в f()");
		throw new Exception("возбуждено из f()");
	}

	public static void g() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("в методе g(), e.printStackTrace()");
			e.printStackTrace();
			throw e;
		}
	}

	public static void h() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("в методе h(), e.printStackTrace()");
			e.printStackTrace(System.out);
			throw (Exception) e.fillInStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			g();
		} catch (Exception e) {
			System.out.println("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
		try {
			h();
		} catch (Exception e) {
			System.out.println("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
}
