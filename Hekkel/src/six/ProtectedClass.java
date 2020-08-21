package six;

public class ProtectedClass {

	public static void main(String[] args) {
		ToProtClass pr = new ToProtClass();
		
		System.out.println(pr.vars());
	}
}

class ToProtClass {
	private String ku = "ku!";

	String vars() {
		return ku;
	}
}
