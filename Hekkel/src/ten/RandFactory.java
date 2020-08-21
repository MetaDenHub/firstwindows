package ten;
/*
 * 
 * Monets by anonymous classes
 * 
 * */

import java.util.Random;

interface Rands {

	void random();
}

interface RandsFactory {
	Rands getRands();
}

class Monet implements Rands {

	@Override
	public void random() {
		// TODO Auto-generated method stub
		System.out.println(" идаЇмо монетку..");

		Integer i = new Random().nextInt(2);

		System.out.println("rndm = " + i);
		if (i == 1) {
			System.out.println("ѕтиц€ орел!!");
		} else {
			System.out.println("–ешка!!");
		}
	}

	static RandsFactory factory = new RandsFactory() {
		@Override
		public Rands getRands() {
			// TODO Auto-generated method stub
			return new Monet();
		}
	};
}

class Bonds implements Rands {
	@Override
	public void random() {
		System.out.println(" идаЇмо кост≥..");

		Integer i = new Random().nextInt(7);

		System.out.println("rndm = " + i);
		System.out.println("Ќомер " + i + "!");
	}

	static RandsFactory factory = new RandsFactory() {

		@Override
		public Rands getRands() {
			// TODO Auto-generated method stub
			return new Bonds();
		}

	};
}

public class RandFactory {
	static void push(RandsFactory factory) {
		Rands r = factory.getRands();
		r.random();
	}

	public static void main(String[] args) {
		push(Monet.factory);
		push(Bonds.factory);

	}

}
