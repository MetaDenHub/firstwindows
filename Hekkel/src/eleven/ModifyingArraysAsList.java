package eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ModifyingArraysAsList {
	public static void main(String[] args) {
		Random rand = new Random();
		Integer[] ia = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(ia));
		System.out.println("до перемешивания " + list1);
		Collections.shuffle(list1, rand);
		System.out.println("после перемешивания " + list1);
		System.out.println("массив " + Arrays.toString(ia));

		List<Integer> list2 = Arrays.asList(ia);
		System.out.println("до перемешивания " + list2);
		Collections.shuffle(list2, rand);
		System.out.println("после перемешивания " + list2);
		System.out.println("массив " + Arrays.toString(ia));
	}
}
