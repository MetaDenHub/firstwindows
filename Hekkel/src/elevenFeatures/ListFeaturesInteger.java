package elevenFeatures;

import java.util.*;

interface Pet {
}

class Humster implements Pet {
	private int i;
	public Humster() {
		// TODO Auto-generated constructor stub
	}
	public Humster(int i) {
		this.i = i;// TODO Auto-generated constructor stub
	}

	public Integer num() {
		return i;
	}

	@Override
	public String toString() {
		return "Humster";
	}
}

class Rat implements Pet {
	private int i;

	public Rat(int i) {
		this.i = i;// TODO Auto-generated constructor stub
	}

	public Integer num() {
		return i;
	}

	@Override
	public String toString() {
		return "Rat";
	}
}

class Manx implements Pet {

	private int i;

	public Manx(int i) {
		this.i = i;// TODO Auto-generated constructor stub
	}

	public Integer num() {
		return i;
	}

	@Override
	public String toString() {
		return "Manx";
	}
}

class Cymric implements Pet {

	private int i;

	public Cymric() {
		
	}
	public Cymric(int i) {
		this.i = i;// TODO Auto-generated constructor stub
	}

	public Integer num() {
		return i;
	}

	@Override
	public String toString() {
		return "Cymric";
	}
}

class Mutt implements Pet {

	private int i;

	public Mutt(int i) {
		this.i = i;// TODO Auto-generated constructor stub
	}

	public Integer num() {
		return i;
	}

	@Override
	public String toString() {
		return "Mutt";
	}
}

class Pug implements Pet {

	private int i;

	public Pug(int i) {
		this.i = i;// TODO Auto-generated constructor stub
	}

	public Integer num() {
		return i;
	}

	@Override
	public String toString() {
		return "Pug";
	}
}

class Mouse implements Pet {

	private int i;

	public Mouse(int i) {
		this.i = i;// TODO Auto-generated constructor stub
	}

	public Integer num() {
		return i;
	}

	@Override
	public String toString() {
		return "Mouse";
	}
}

class Pets {
	static ArrayList arrayList(int i) {
		ArrayList<String> petList = new ArrayList<String>(i);

		petList.add(Integer.toString(new Rat(0).num()));
		petList.add(Integer.toString(new Manx(1).num()));
		petList.add(Integer.toString(new Cymric(2).num()));
		petList.add(Integer.toString(new Mutt(3).num()));
		petList.add(Integer.toString(new Pug(4).num()));
		petList.add(Integer.toString(new Cymric(5).num()));
		petList.add(Integer.toString(new Pug(6).num()));

		return petList;
	}
}

public class ListFeaturesInteger {

	public static void main(String[] args) {
		Random rand = new Random(47);
		List<String> pets = Pets.arrayList(7);
		System.out.println("1: " + pets);
		Humster h = new Humster();
		pets.add(Integer.toString(h.num()));
		System.out.println("2: " + pets);
		System.out.println("3: " + pets.contains(h));
		pets.remove(h);
		String p = pets.get(2);
		System.out.println("4: " + p + " " + pets.indexOf(p));
		Pet cymric = new Cymric();
		System.out.println("5: " + pets.indexOf(cymric)); // -1
		System.out.println("6: " + pets.remove(cymric)); // false
		System.out.println("7: " + pets.remove(p));
		System.out.println("8: " + pets);
		List<String> sub = pets.subList(1, 4);
		System.out.println("10: " + pets.containsAll(sub));
		// Collections.sort(sub); // не работает
		System.out.println("11: " + sub); // не отсортировало
		Collections.shuffle(sub, rand); // mixing
		System.out.println("12: " + pets.containsAll(sub));
		System.out.println(pets);
		List<String> copy = new ArrayList<String>(pets);
		System.out.println("sub: " + sub);
		sub = Arrays.asList(pets.get(1), pets.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		System.out.println(pets);
		copy = new ArrayList<String>(pets);
		copy.remove(2);
		System.out.println("14: " + copy);
		copy.removeAll(sub);
		System.out.println("15: " + copy);
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
	}
}
