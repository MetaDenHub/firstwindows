package eight;
/*
 * about task of calling extends construktors
 * 
 * 
 * */
class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}
	Glyph(){
		System.out.println("Glyph() before 'draw()' calling..");
		draw();
		System.out.println("Glyph() after 'draw()' calling..");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	public RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	void draw() {
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}

class RectangularGlyph extends Glyph{
	private int radius = 1;
	public RectangularGlyph(int r) {
		radius = r;
		System.out.println("RectangularGluph.RectangularGluph() , radius = " + radius);
	}
	void draw() {
		System.out.println("RectangularGluph.draw() , radius = " + radius);
	}
}

public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
		new RectangularGlyph(3);
	}
}
