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

public class Cycle {
	public void ride(Speed s, int cnt) {
		System.out.println("Cycle.ride()");
		wheels(cnt);
	}

	public void wheels(int cnt) {
		System.out.println(cnt + " wheels");
	}

	public void balance() {
		System.out.println("cycle balance");
	}

}