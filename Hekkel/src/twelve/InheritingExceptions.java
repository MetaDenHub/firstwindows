package twelve;

class SimpleException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}		

public class InheritingExceptions {
	public void f() throws SimpleException {
		System.out.println("возбуждаем простое исключение из f()");
		throw new SimpleException();
	}
	public static void main(String[] args) {
		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		} catch (SimpleException e) {
			System.out.println("перехвачено!");
			e.printStackTrace(System.out);
		}
		
	}
}
