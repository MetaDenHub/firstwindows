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

public class Wind extends Instrument {
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}

	

}
