package eight;

/**
 * Using Polymorphism with:
 * 
 * Wind.java Note.java
 * 
 * Main:
 * 
 * Music.java Music2.java Music3.java
 */

class Stringed extends Instrument {
	public void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}
}

class Brass extends Instrument {
	public void play(Note n) {
		System.out.println("Brass.play() " + n);
	}
}

class Music2 {
	public static void tune(Wind i) {
		i.play(Note.MIDDLE_C); // NOT using with polymorphism
	}

	public static void tune(Stringed i) {
		i.play(Note.C_SHARP); // NOT using with polymorphism
	}

	public static void tune(Brass i) {
		i.play(Note.B_FLAT); // NOT using with polymorphism
	}

	public static void main(String[] args) {
		Wind flute = new Wind();
		Stringed violin = new Stringed();
		Brass frenchHorn = new Brass();
		tune(flute);
		tune(violin);
		tune(frenchHorn);
	}
}
