package eightRodent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Rodent {

	private int refcount = 0;
	private static long counter = 0;
	protected final long id = counter++;

	String s = "rodent";

	Rodent() {
		System.out.println("Rodent() " + s + " | " + this);
	}

	public void eat() {
		System.out.println("Rodent eating.. ");
	}

	public void sleeping() {
		System.out.println("Rodent sleeping.. ");
	}

	public void dispose() {
		System.out.println("Disposing " + this);
	}

	public String toString() {
		return "Rodent " + id;
	}
}

class Mouse extends Rodent {
	String s = "mouse ";

	public Mouse() {
		System.out.println("Mouse() " + s + super.s);// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Mouse eating.. ");
	}

	public void sleeping() {
		System.out.println("Mouse sleeping.. ");
	}
	
	public String toString() {
		return "Mouse " + id;
	}
	
	public void dispose() {
		super.dispose();
	}
}

class Hamster extends Rodent {
	static String s = "ham-hamster ";

	public Hamster() {
		System.out.println("Hamster() " + s + super.s);// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Hamster eating.. ");
	}

	public void sleeping() {
		System.out.println("Hamster sleeping.. ");
	}
	
	public String toString() {
		return "Hamster " + id;
	}
	
	public void dispose() {
		super.dispose();
	}
}

class Marmot extends Rodent {
	String s = "marmot ";

	public Marmot() {
		System.out.println("Marmot() " + s + super.s);// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Marmot eating.. ");
	}

	public void sleeping() {
		System.out.println("Marmot sleeping.. ");
	}
	public void dispose() {
		super.dispose();
	}
	
	public String toString() {
		return "Marmot " + id;
	}
}

public class Rodents {
	public Rodents() {
		System.out.println("Rodents()");// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Rodent[] rds = {new Hamster(), new Hamster(), new Marmot(), new Mouse() };
		List<Rodent> rds = new ArrayList<Rodent>();
		rds.add(new Hamster());
		rds.add(new Marmot());
		eat(rds.iterator());
		for (Rodent rodent : rds) {
			rodent.dispose();
		}
	}

	private static void eat(Iterator<Rodent> rds) {
		while (rds.hasNext()) {
			Rodent r = rds.next();
			r.sleeping();
			r.eat();
		}
		System.gc();
	}

}
