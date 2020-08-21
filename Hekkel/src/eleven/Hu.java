package eleven;

class Boring {
	void s() {
	}
}

class TooBoring extends Boring {
	void s() {
		System.out.println("sdfsdfsf");
	}
}

public class Hu {
	public static void main(String[] args) {
		Boring d = new TooBoring();
		((Boring) d).s();
	}
}
