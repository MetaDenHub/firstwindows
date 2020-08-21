package seven;

class Amphibian {
	void hi() {
		System.out.println("hi");
	}
}

public class Frog extends Amphibian {

	void hi() {
		System.out.println("hi!!");
	}
	static Amphibian f = new Frog();
	
	public static void main(String[] args) {
		f.hi();
	}

}
