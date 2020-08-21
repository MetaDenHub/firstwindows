package ten;

class Seecond {
	static Thirteen thirt() {
		return new Thirteen(7) {
			
		};
	}
	
}

public class Thirteen {
	public Thirteen(int i) {
		System.out.println(i);
	}
	void hello(){
		System.out.println("hello!@");
	}
	public static void main(String[] args) {
		
		Seecond.thirt().hello();
	}
}
