package five;

public class This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This th = new This();
		th.one();
	}
	void one() {
		two();
		this.two();
	}
	void two() {
		System.out.println("hi!");
	}

}
