package eleven;

import java.util.LinkedList;

public class LinkedListFeatures {
	public static void main(String[] args) {
		LinkedList<Pet> pets = new LinkedList<Pet>(Pets.arrayList(5));
		System.out.println(pets);
		// идентично
		System.out.println("pets.getFirst() " + pets.getFirst());
		System.out.println("pets.element() " + pets.element());
		// отличие только при пустом списке:
		System.out.println("pets.peek() " + pets.peek());
		// идентично удаление и возвращение первого елемента:
		System.out.println("pets.remove() " + pets.remove());
		System.out.println("pets.removeFirst() " + pets.removeFirst());
		System.out.println(pets);
		// отличие только при пустом списке:
		System.out.println("pets.poll() " + pets.poll());
		System.out.println(pets);
		pets.addFirst(new Rat());
		System.out.println("after addFirst " + pets);
		pets.offer(Pets.randomPet(5));
		System.out.println("offer() " + pets);
		pets.add(Pets.randomPet(5));
		System.out.println("add(Pets.randomPet(5) " + pets);
		pets.addLast(new Humster("Xymster"));
		System.out.println("addLast() " + pets);
		System.out.println("pets.removeLast() " + pets.removeLast());
	}
}
