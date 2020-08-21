package eightMusic2;

import java.util.Random;

/**
 * Using Polymorphism with:
 * 
 * Wind.java Note.java
 * 
 * Main:
 * 
 * Music.java Music2.java Music3.java
 */

class Instrument {
	public void play(Note n) {
		System.out.println("Instrument.play() " + n);
	}

	public String toString() {
		return "instrument";
	}

	void adjust() {
		System.out.println("adjusting instrument");
	}
}

class Wind extends Instrument {
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	void adjust() {
		System.out.println("adjusting Wind ");
	}
}

class Percussion extends Instrument {
	public void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}

	public String toString() {
		return "percussion";
	}

	void adjust() {
		System.out.println("adjusting percussion");
	}
}

class Stringed extends Instrument {
	public void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	void adjust() {
		System.out.println("adjusting Stringed");
	}
}

class Brass extends Wind {
	public void play(Note n) {
		System.out.println("Brass.play() " + n);
	}

	void adjust() {
		System.out.println("adjusting Brass");
	}

	public String toString() {
		return "Brass extends Wind";
	}
}

class WoodWind extends Wind {
	public void play(Note n) {
		System.out.println("WoodWind.play() " + n);
	}

	public String toString() {
		return "WoodWind extends Wind";
	}

}

class Saxofone extends Wind {
	public void play(Note n) {
		System.out.println("Sax.play() " + n);
	}

	public String toString() {
		return "Sax extends Wind";
	}
}

public class Music3 {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e) {
			tune(i);
			System.out.println(i);
		}
	}

	private static Instrument factory() {
		Random rnd = new Random(47);
		switch (rnd.nextInt(6)) {
		default:
		case 0:
			return new Wind();
		case 1:
			return new Percussion();
		case 2:
			return new Brass();
		case 3:
			return new Stringed();
		case 4:
			return new WoodWind();
		case 5:
			return new Saxofone();
		}
	}

	public static void main(String[] args) {
		// upcasting with massive adding
		
		 Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new
		 Brass(), new WoodWind(), new Saxofone() }; for (Instrument instrument :
		 orchestra) System.out.println(instrument); System.out.println();
		 tuneAll(orchestra);
		 
		Instrument[] orch = new Instrument[6];
		Music3 gen = new Music3();
		for (int i = 0; i < 6; i++) {
			orch[i] = factory();
		}
		tuneAll(orch);

	}

}
