package eight;

import java.util.Iterator;
import java.util.Random;

class Shape {
	public void draw() {
	};

	public void erase() {
	};

}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.print("draw circle ");
	};

	@Override
	public void erase() {
		System.out.print("erase circle ");
	};
}

class Square extends Shape {
	@Override
	public void draw() {
		System.out.print("draw Square ");
	};

	@Override
	public void erase() {
		System.out.print("erase Square ");
	};
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.print("draw Triangle ");
	};

	@Override
	public void erase() {
		System.out.print("erase Triangle ");
	};
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.print("draw Line ");
	};

	@Override
	public void erase() {
		System.out.print("erase Line ");
	};
}

class RandomShapeGenerator implements Iterable<Integer> {
	private static int rndi = 0;
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			private int index = 0;
			@Override
			public boolean hasNext() {
				return index < rndi;
			}
			@Override
			public Integer next() {
				return index++;
			}
		};
	}
	public RandomShapeGenerator(int i) {
		rndi = i;
	}
	private Random rand = new Random(47);

	public Shape next() {
		switch (rand.nextInt(rndi)) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		case 3:
			return new Line();
		}
	}
}

public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator(5);

	public static void main(String[] args) {
		Shape[] s = new Shape[5];
		for (int i = 0; i < s.length; i++)
			s[i] = gen.next();
		for (Shape shape : s) {
			System.out.println(gen.next());
		}
		// polymorph's Methods calling:
		for (Integer shp : new RandomShapeGenerator(5)) {
			//System.out.println(shp);
		}

	}
}