package nine;

import eight.Note;

/*
 * 
 * abstract class for Wind Percussion and Stringed
 * 
 * */

abstract class ToDo {
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

class Winddd extends ToDo {
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

class Percussionnn extends ToDo {
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

class Stringeddd extends ToDo {
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

class Brassss extends Winddd {
	public String toString() {
		return "Brass";
	}
}

class WoodWinddd extends Winddd {
	public String toString() {
		return "WoodWind extends Wind";
	}

}

class Saxofoneee extends Winddd {
	public void play(Note n) {
		System.out.println(this + " Sax.play() " + n);
	}

	public String toString() {
		return "Sax extends Wind";
	}
}

public class Music6 {
	static void tune(ToDo i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(ToDo[] e) {
		for (ToDo instrument : e) {
			tune(instrument);
		}
	}

	public static void main(String[] args) {
		// upcasting:
		ToDo[] orchestra = { new Winddd(), new Brassss(), new Percussionnn(), new Saxofoneee(), new WoodWinddd(),
				new Stringeddd() };
		tuneAll(orchestra);
	}

}
