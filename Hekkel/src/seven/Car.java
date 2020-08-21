package seven;

// двигун
class Engine {
	public void start() {
	}

	public void rev() {
	}

	public void stop() {
	}

	public void servise() {
	}
}

// колесо
class Wheel {
	public void inflate(int psi) {
	}
}

// вікно
class Window {
	public void rollup() {
	}

	public void rolldown() {
	}
}

// двері
class Door {
	public Window window = new Window();

	public void open() {
	}

	public void close() {
	}
}

// машина
public class Car {
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door left = new Door(), right = new Door();

	public Car() {
		for (int i = 0; i < 4; i++)
			wheel[i] = new Wheel();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.engine.start();
		car.engine.servise();
		car.left.window.rollup();
		car.wheel[0].inflate(2);
	}

}
