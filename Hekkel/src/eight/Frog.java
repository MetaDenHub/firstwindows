package eight;

class Characteristic {
	private String s;

	public Characteristic(String s) {
		this.s = s;
		System.out.println("creating characteristic.. " + s);
	}

	protected void dispose() {
		System.out.println("ending characteristic.. " + s);
	}
}

class Description {
	private String s;

	Description(String s) {
		this.s = s;
		System.out.println("creating description" + s);
	}

	protected void dispose() {
		System.out.println("ending description.. " + s);
	}
}

class LivingCreature {
	private Characteristic p = new Characteristic("live creation");
	private Description t = new Description("simple live creation");

	public LivingCreature() {
		System.out.println("LivingCreation()");// TODO Auto-generated constructor stub
	}

	protected void dispose() {
		System.out.println("dispose in LivingCreation.. ");
		t.dispose();
		p.dispose();
	}

}

class Animal extends LivingCreature {
	private Characteristic p = new Characteristic("it has own heart..");
	private Description t = new Description("live, not a plane");

	Animal() {
		System.out.println("Animal()");
	}

	protected void dispose() {
		System.out.println("dispose() in Animal ");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal {
	private Characteristic p = new Characteristic("can live in the water");
	private Description t = new Description("as in the watew as in the land");

	public Amphibian() {
		System.out.println("Amphibian()");// TODO Auto-generated constructor stub
	}

	protected void dispose() {
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

public class Frog extends Amphibian {
	private Characteristic p = new Characteristic("croaks");
	private Description t = new Description("eats bugs");

	public Frog() {
		System.out.println("Frog()");
	}

	protected void dispose() {
		System.out.println("ending Frog");
		t.dispose();
		p.dispose();
		super.dispose();
	}

	public static void main(String[] args) {
		Frog frog = new Frog();
		System.out.println("By!");
		frog.dispose();
	}

}
