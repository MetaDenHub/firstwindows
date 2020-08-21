package nine;

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
		System.out.println("������ �������..");

		Integer i = new Random().nextInt(2);

		System.out.println("rndm = " + i);
		if (i == 1) {
			System.out.println("����� ����!!");
		} else {
			System.out.println("�����!!");
		}
	}
}

class MonetFactory implements RandsFactory {
	@Override
	public Rands getRands() {
		// TODO Auto-generated method stub
		return new Monet();
	}
}

class Bonds implements Rands {
	@Override
	public void random() {
		System.out.println("������ ����..");

		Integer i = new Random().nextInt(7);

		System.out.println("rndm = " + i);
		System.out.println("����� " + i + "!");
	}
}

class BondsFactory implements RandsFactory {
	@Override
	public Rands getRands() {
		// TODO Auto-generated method stub
		return new Bonds();
	}
}

public class RandomFactory {
	static void push(RandsFactory factory) {
		Rands r = factory.getRands();
		r.random();
	}

	public static void main(String[] args) {
		push(new BondsFactory());
		push(new MonetFactory());

	}

}
