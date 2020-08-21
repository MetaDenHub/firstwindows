package eight;

/*
 * Testing order of initializing with composition, extending and polymorphism
 * 
 * */

class Meal {
	public Meal() {
		System.out.println("Meal()");// TODO Auto-generated constructor stub
	}
}

class Bread {
	Bread() {
		System.out.println("Bread()");
	}
}

class Chees {
	Chees() {
		System.out.println("Chees()");
	}
}

class Lettuce {
	Lettuce() {
		System.out.println("Lettuce");
	}
}

class Pickle {
	public Pickle() {
		System.out.println("Pickle()");
	}
}

class Lunch extends Meal {
	Lunch() {
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch {
	public PortableLunch() {
		System.out.println("PortableLunch()");
	}
}

public class Sandwich extends PortableLunch {
	private Bread b = new Bread();
	private Chees c = new Chees();
	private Lettuce l = new Lettuce();
	private Pickle p = new Pickle();
	public Sandwich() {
		System.out.println("Sandwich()");
	}

	public static void main(String[] args) {
		new Sandwich();
	}

}
