package ten;
interface Bla {
	void alb();
}
public class ParcelSeven {

	static Bla toBla() {
		
		return new Bla() {
			@Override
			public void alb() {
				System.out.println("hello bla");
			}
		};
	}
	
	
	
	public static void main(String[] args) {
		toBla().alb();
		
	}

}
