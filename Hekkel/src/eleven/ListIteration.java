package eleven;

import java.util.List;
import java.util.ListIterator;

public class ListIteration {
	public static void main(String[] args) {
		List<Pet> pets = Pets.arrayList(8);
		ListIterator<Pet> it = pets.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next() + ", " + 
					it.nextIndex() + ", " + it.previousIndex() + ";");
		}
		while(it.hasPrevious()) {
			System.out.println(it.previous().id());
		}
		System.out.println(pets);
		it = pets.listIterator(3);
		while(it.hasNext()) {
			it.next();
			it.set(Pets.randomPet(pets.size()));
		}
		System.out.println(pets);
	}
}
