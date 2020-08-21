package seven;

class Shape {
	Shape(int i) {
		System.out.println("Constructor Shape");
	}

	void dispose() {
		System.out.println("Ending Shape");
	}
}

class Circle extends Shape {
	Circle(int i) {
		super(i);
		System.out.println("Painting Circle");
	}

	void dispose() {
		System.out.println("disposing Circle");
		super.dispose();
	}
}

class Triangle extends Shape {
	Triangle(int i) {
		super(i);
		System.out.println("printing triangle..");
	}

	void dispose() {
		System.out.println("disposing triangle..");
		super.dispose();
	}
}

class Line extends Shape {
	private int start, end;

	Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("printing line: " + start + ", " + end);
	}

	void dispose() {
		System.out.println("disposing line: " + start + ", " + end);
		super.dispose();
	}
}

public class CADSystem extends Shape {
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];

	public CADSystem(int i) {
		super(i + 1);
		for (int j = 0; j < lines.length; j++)
			lines[j] = new Line(j, j * j);
		c = new Circle(1);
		t = new Triangle(1);
		System.out.println("Comby constructor");
	}

	void dispose() {
		System.out.println("CADSystem dispose()");
		// завершення відбувається у порядку, зворотньому ініціалізації
		t.dispose();
		c.dispose();
		for (int i = lines.length - 1; i >= 0; i--)
			lines[i].dispose();
		super.dispose();
	}

	public static void main(String[] args) {
		CADSystem x = new CADSystem(47);
		try {
			// код і обробка зображення
		} finally {
			x.dispose();
		}
	}
}
