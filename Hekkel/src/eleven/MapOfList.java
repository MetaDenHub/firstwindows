package eleven;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fourteen.Person;

public class MapOfList {
	public static Map<Person, List<? extends Pet>> petPeople = new HashMap<Person, List<? extends Pet>>();
	static {
		petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
		petPeople.put(new Person("Kate"),
				Arrays.asList(new Cat("Shakleton"), new Cat("Elsie May"), new Dog("Margrett")));
		petPeople.put(new Person("Marilyn"),
				Arrays.asList(new Pug("Swin"), new Cat("Stanford aka Stinky el Negro"), new Dog("Fak")));
	}

	public static void main(String[] args) {
		System.out.println("People: " + petPeople.keySet());
		System.out.println("Pets: " + petPeople.values());
		for (Person person: petPeople.keySet()) {
			System.out.println(person + " has:");
			for (Pet pet : petPeople.get(person)) 
				System.out.println("    " + pet);
		}
	}
}
