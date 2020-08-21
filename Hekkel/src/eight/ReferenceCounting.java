package eight;

class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;

	public Shared() {
		System.out.println("Creating " + this);
	}

	public void addRef() {
		refcount++;
	}

	protected void dispose() {
		if (--refcount == 0) {
			System.out.println("Disposing " + this);
			System.gc();
			System.runFinalization();
		}
	}

	public String toString() {
		return "Shared " + id;
	}
	public void finalize() {
		System.out.println("ошибка");
	}

}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;

	public Composing(Shared shared) {
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}

	protected void dispose() {
		System.out.println("Disposing " + this);
		shared.dispose();

	}

	public String toString() {
		return "Composing " + id;
	}

	public void finalize() {
		System.out.println("ошибка");
	}
}

public class ReferenceCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Shared shared1 = new Shared();
		Composing[] composing = { new Composing(shared), new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared) };
		//new Composing(shared);
	
		for (int i=0;i<9;i++) {
			composing[1].dispose();
		}
	}
}
