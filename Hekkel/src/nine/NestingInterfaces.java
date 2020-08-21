package nine;

class A1{
	interface B {
		void f();
	}
	public class BImpl implements B{
		public void f() {};
	}
	public class BImpl2 implements B{
		public void f() {};
	}
	public interface C{
		void f();
	}
	class CImpl implements C{
		public void f() {};
	}
	class CImpl2 implements C{
		public void f() {};
	}
	private interface D{
		void f();
	}
	private class DImpl implements D{
		public void f() {};
	}
	public class DImpl2 implements D{
		public void f() {};
	}
	public D getD() {return new DImpl2();}
	private D dRef;
	public void receiveD(D d) {
		dRef = d;
		dRef.f();
	}
}

interface E{
	interface G{
		void f();
	}
	// избыточное обьявление public 
	public interface H{
		void f();
	}
	void g();
	//не может быть private внутри интерфейса
	//! private interface I{}
}

public class NestingInterfaces {
	public class BImpl implements A1.B{
		public void f() {};
	}
	class CImpl implements A1.C{
		public void f() {}
	}
	
	/*
	 * class DImpl implements A.D{ public void f() {} }
	 */
	class EImpl implements E{
		@Override
		public void g() {
		}
	}
	class EGImpl implements E.G{
		public void f() {} 
	}
	class EImpl2 implements E{
		public void g() {} 
	}
	class EG implements E.G{
		public void f() {}
	}
	public static void main(String[] args) {
		A1 a = new A1();
		//нет доступа к A.D
		//A.D  ad = new  a.getD();
		//
		//
		//
		A1 a2 = new A1();
		a2.receiveD(a.getD());
	}

}
