package seven;

class Poppet {
	private int i;

	public Poppet(int ii) {
		i = ii;// TODO Auto-generated constructor stub
	}
}

public class BlankFinal {
	private final int i = 0;
	private final int j;
	private final Poppet p;

// порожні константи необхідно ініціалізувати у конструкторі:
	public BlankFinal() {
		j = 1;
		p = new Poppet(1);
	}
	
	public BlankFinal(int x) {
		j = x;
		p = new Poppet(x);
	}

	public static void main(String[] args) {
		new BlankFinal();
		new BlankFinal(47);
		System.out.println();
	}

}
