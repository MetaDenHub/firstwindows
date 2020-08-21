package nine;

import eight.Note;
import five.This;

/*
 * 
 * polymorphism with abstract class
 * 
 * */

interface Instrumentt {
	int VALUE = 5; // static and final
	void adjust();
}

interface Playable {
	void play(Note n); // avto is public

}

class Windd implements Instrumentt, Playable {
	public void play(Note n) {
		System.out.println(this + " Wind.play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	public void adjust() {
		System.out.println(this + " adjusting Wind ");
	}

}

class Percussionn implements Instrumentt, Playable {
	public void play(Note n) {
		System.out.println(this + " Percussion.play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	public void adjust() {
		System.out.println(this + " adjusting percussion");
	}
}

class Stringedd implements Instrumentt, Playable {
	public void play(Note n) {
		System.out.println(this + " Stringed.play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	public void adjust() {
		System.out.println(this + " adjusting Stringed");
	}
}

class Brasss extends Windd {
	public String toString() {
		return "Brass";
	}
}

class WoodWindd extends Windd {
	public String toString() {
		return "WoodWind extends Wind";
	}

}

class Saxofonee extends Windd {
	public void play(Note n) {
		System.out.println(this + " Sax.play() " + n);
	}

	public String toString() {
		return "Sax extends Wind";
	}
}

public class MusicInterface {
	static void tune(Playable i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable[] e) {
		for (Playable instrumentt : e) {
			tune(instrumentt);
		}
	}

	public static void main(String[] args) {
		// upcasting:
		Playable[] orchestra = { new Windd(), new Brasss(), new Percussionn(), new Saxofonee(), new WoodWindd(),
				new Stringedd() };
		tuneAll(orchestra);
	}

}
