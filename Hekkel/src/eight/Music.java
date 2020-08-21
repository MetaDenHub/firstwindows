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
public class Music {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute); // upcasting

	}
}
