package nine;

/*
 * 
 * polymorphism with abstract class
 * 
 * */
import eight.Note;

abstract class Instrument {
	private int i; // memory stands out for each object

	public abstract void play(Note n);

	public String What() {
		return "Instrument";
	}

	public abstract void adjust();
}

class Wind extends Instrument {
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}

	public String what() {
		return "What()";
	}

	public String toString() {
		return "Wind";
	}

	public void adjust() {
		System.out.println("adjusting Wind ");
	}
}

class Percussion extends Instrument {
	public void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}

	public String what() {
		return "Percussion";
	}

	public void adjust() {
		System.out.println("adjusting percussion");
	}
}

class Stringed extends Instrument {
	public void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}

	public String what() {
		return "Stringed";
	}

	public void adjust() {
		System.out.println("adjusting Stringed");
	}
}

class Brass extends Wind {
	public void play(Note n) {
		System.out.println("Brass.play() " + n);
	}

	public void adjust() {
		System.out.println("adjusting Brass");
	}
}

class WoodWind extends Wind {
	public void play(Note n) {
		System.out.println("WoodWind.play() " + n);
	}

	public String what() {
		return "WoodWind extends Wind";
	}

}

class Saxofone extends Wind {
	public void play(Note n) {
		System.out.println("Sax.play() " + n);
	}

	public String what() {
		return "Sax extends Wind";
	}
}

public class Music4 {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument[] e) {
		for (Instrument instrument : e) {
			tune(instrument);
		}
	}

	public static void main(String[] args) {
		// upcasting:
		Instrument[] orchestra = { new Wind(), new Brass(), new Percussion(), new Saxofone(), new WoodWind(),
				new Stringed() };
		tuneAll(orchestra);
	}

}
