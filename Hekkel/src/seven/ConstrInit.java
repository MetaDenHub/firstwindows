package seven;

class One {
	One() {
		System.out.println("One! Two! Three!");
	}
}

class Two extends One {

}

public class ConstrInit extends Two {

	public ConstrInit() {
		System.out.println("Ulika!");// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ConstrInit c = new ConstrInit();
	}

}
