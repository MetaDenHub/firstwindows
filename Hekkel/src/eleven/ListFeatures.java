package eleven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import four.Rands;

import java.util.*;

interface Pet {

	int id();
}

class Humster extends Pets implements Pet{
	String name;
	public Humster(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Humster";
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 1;
	}
}

class Cat extends Pets {
	String name;

	public Cat(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}

class Dog extends Pets {
	String name;

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}

class Rat extends Pets {
	@Override
	public String toString() {
		return "Rat";
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 2;
	}
}

class Manx extends Pets {
	@Override
	public String toString() {
		return "Manx";
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 3;
	}
}

class Cymric extends Pets {
	String name;

	public Cymric(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 4;
	}
}

class Mutt extends Pets {
	String name;

	public Mutt(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mutt";
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 5;
	}
}

class Pug extends Pets {
	String name;
	public Pug(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Pug";
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 5;
	}
}

class Mouse extends Pets {
	@Override
	public String toString() {
		return "Mouse";
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 6;
	}
}

class Pets implements Pet {
	static Pet[] pett = new Pet[8];
	
	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 0;
	}

	static ArrayList arrayList(int i) {

		ArrayList<Pet> petList = new ArrayList<Pet>(i);
		petList.add(new Rat());
		petList.add(new Manx());
		petList.add(new Cymric("Cipa-cipa"));
		petList.add(new Mutt("Mud"));
		petList.add(new Pug("As"));
		petList.add(new Cymric("Cipp"));
		petList.add(new Pug("Siger"));
		petList.add(new Pug("Siger"));
		return petList;
	}

	public static Pets randomPet(int i) {
		Random rnd = new Random();
		int s = rnd.nextInt(i);
		ArrayList p = Pets.arrayList(i);
		return (Pets) p.get(s);
	}

	public static Pet[] createArray() {
		
		for(int j = 0; j < pett.length; j++)
			nextPet(j);
		
		
		return pett;
	}

	private static void nextPet(int j) {
		switch (j) {
		case 0: 
			pett[0] = new Humster("fg");
			break;
			
		case 1:
			pett[1]=new Pug("fg");
			break;	
		
		case 2:
			pett[2] = new Mouse();
			break;	
		case 3: 
			pett[3] = new Humster("fg");
			break;
			
		case 4:
			pett[4]=new Pug("fg");
			break;	
		
		case 5:
			pett[5] = new Mouse();
			break;	
		case 6: 
			pett[6] = new Humster("fg");
			break;
			
		case 7:
			pett[7]=new Pug("fg");
			break;	
		
		
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + j);
		}
	}
}

public class ListFeatures {

	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Pet> pets = Pets.arrayList(7);
		System.out.println("1: " + pets);
		Humster h = new Humster("Xam");
		pets.add(h);
		System.out.println("2: " + pets);
		System.out.println("3: " + pets.contains(h));
		pets.remove(h);
		Pet p = pets.get(2);
		System.out.println("4: " + p + " " + pets.indexOf(p));
		Pet cymric = new Cymric("Cimric");
		System.out.println("5: " + pets.indexOf(cymric)); // -1
		System.out.println("6: " + pets.remove(cymric)); // false
		System.out.println("7: " + pets.remove(p));
		System.out.println("8: " + pets);
		pets.add(3, new Mouse());
		System.out.println("9: " + pets);
		List<Pet> sub = pets.subList(1, 4);
		System.out.println("10: " + pets.containsAll(sub));
		// Collections.sort(sub); // это говно не работает
		System.out.println("11: " + sub); // хуй, нихуя не отсортировало
		Collections.shuffle(sub, rand); // mixing
		System.out.println("12: " + pets.containsAll(sub));
		System.out.println(pets);
		List<Pet> copy = new ArrayList<Pet>(pets);
		System.out.println("sub: " + sub);
		sub = Arrays.asList(pets.get(1), pets.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		System.out.println(pets);
		copy = new ArrayList<Pet>(pets);
		copy.remove(2);
		System.out.println("14: " + copy);
		copy.removeAll(sub);
		System.out.println("15: " + copy);
		copy.set(1, new Mouse());
		System.out.println("16: " + copy);
		System.out.println("sub = " + sub);
		copy.addAll(2, sub);
		System.out.println("17: " + copy);
		System.out.println("18: " + pets.isEmpty());
		pets.clear();
		System.out.println("19: " + pets);
		System.out.println("20: " + pets.isEmpty());
		pets.addAll(Pets.arrayList(4));
		System.out.println("21: " + pets);
		Object[] o = pets.toArray();
		System.out.println("22: " + o[3]);
		Pet[] pa = pets.toArray(new Pet[0]);
		System.out.println("23: " + pa[3]);
	}
}
