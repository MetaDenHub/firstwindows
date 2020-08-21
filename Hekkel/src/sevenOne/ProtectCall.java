package sevenOne;


public class ProtectCall {
	protected void hello() {
		System.out.println("hello!");
	}
	
	public void toHello() {
		hello();
	}
}
