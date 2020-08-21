package eightCycle;

/**
 * Using Polymorphism with:
 * 
 * Unicycle Bicycle Tricycle, enum Speed
 * 
 * Main:
 * 
 * Riding.java
 */
class Unicycle extends Cycle {
	public void ride(Speed s, int cnt) {
		System.out.println("Unicycle riding " + s);
		wheels(cnt);
	}

	public void balance() {
		System.out.println("Unicycle balance");
	}

	public void wheels(int cnt) {
		System.out.println(cnt + " wheels");
	}
}

class Bicycle extends Cycle {
	public void ride(Speed s, int cnt) {
		System.out.println("Bicycle riding " + s);
		wheels(cnt);
	}

	public void balance() {
		System.out.println("Bicycle balance");
	}

	public void wheels(int cnt) {
		System.out.println(cnt + " wheels");
	}
}

class Tricycle extends Cycle {
	public void ride(Speed s, int cnt) {
		System.out.println("Tricycle riding " + s);
		wheels(cnt);
	}

	public void wheels(int cnt) {
		System.out.println(cnt + " wheels");
	}
}

public class Riding {
	public static void ride(Cycle c, int cnt) {
		c.ride(Speed.HIGH, cnt);
	}

	public static void main(String[] args) {
		Cycle[] c = { new Unicycle(), new Bicycle(), new Tricycle() };
		c[0].balance();
		c[1].balance();
		c[2].balance();
		Unicycle unic = new Unicycle();
		ride(unic, 1);
		Bicycle bicy = new Bicycle();
		ride(bicy, 2);
		Tricycle tricy = new Tricycle();
		ride(tricy, 3);
	}
}
