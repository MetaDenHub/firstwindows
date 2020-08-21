package eleven;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CrossContainerIteration {
	public static void display(Iterator<Pet> it) {
		while(it.hasNext()) {
			Pet p = it.next();
			System.out.println(p.id() + ":" + p + " ");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Pet> pets = Pets.arrayList(8);
		LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
		HashSet<Pet> petHS = new HashSet<Pet>(pets);
	//	TreeSet<Pet> petTS = new TreeSet<Pet>(pets);
		display(pets.iterator());
		display(petsLL.iterator());
		display(petHS.iterator());
		//display(petTS.iterator());
	}
}
