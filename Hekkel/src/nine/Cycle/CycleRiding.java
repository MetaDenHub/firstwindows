package nine.Cycle;
// Factory pattern for Cycle


import eightCycle.Speed;

//////////////////////////////////////

interface Ride {
	public void ride(Speed s, int cnt);

	public void balance();

	public void wheels(int cnt);
}

interface RideFactory {
	Ride getRide();
}

class Unicycle implements Ride {
	public void ride(Speed s, int cnt) {
		System.out.println("Unicycle riding " + s);
	}

	public void balance() {
		System.out.println("Unicycle balance");
	}

	public void wheels(int cnt) {
		System.out.println(cnt + " wheels");
	}
}

class UnicycleFactory implements RideFactory {
	@Override
	public Ride getRide() {
		// TODO Auto-generated method stub
		return new Unicycle();
	}
}

class Bicycle implements Ride {
	public void ride(Speed s, int cnt) {
		System.out.println("Bicycle riding " + s);
	}

	public void balance() {
		System.out.println("Bicycle balance");
	}

	public void wheels(int cnt) {
		System.out.println(cnt + " wheels");
	}
}

class BicycleFactory implements RideFactory {
	@Override
	public Ride getRide() {
		// TODO Auto-generated method stub
		return new Bicycle();
	}
}

class Tricycle implements Ride {
	public void ride(Speed s, int cnt) {
		System.out.println("Tricycle riding " + s);
	}

	public void wheels(int cnt) {
		System.out.println(cnt + " wheels");
	}

	@Override
	public void balance() {

	}
}

class TricycleFactory implements RideFactory {
	@Override
	public Ride getRide() {
		// TODO Auto-generated method stub
		return new Tricycle();
	}
}

//////////////////////
public class CycleRiding {
	public static void riding(RideFactory factory) {
		Ride s = factory.getRide();
		if (s.getClass().getName() == "nine.Cycle.Bicycle") {
			s.ride(Speed.HIGH, 120);
			s.balance();
			s.wheels(2);
		}
	}

	public static void main(String[] args) {
		riding(new BicycleFactory());
		riding(new UnicycleFactory());
		riding(new TricycleFactory());
		System.out.println((new Bicycle()).getClass().getName());
	}
}