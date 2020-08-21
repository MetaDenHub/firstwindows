package eleven;

import java.util.LinkedList;
import java.util.ListIterator;
/*
 * 
 * 
 * добавляет числа ровно в середину списка
 * 
 */
public class MiddleInput {
	public static void main(String[] args) {
		LinkedList<Integer> linteger = new LinkedList<>();

		ListIterator<Integer> iterator = linteger.listIterator();
		for (int i = 0; i < 20; i++) {
			if (i < 2) {
				linteger.add(i);
				continue;
			}
			System.out.println(linteger);
			int j = i / 2;
			linteger.add(j, i);
			System.out.println(linteger);
		}
		System.out.println(linteger);

		/*
		 * while(iterator.hasNext()) { if(iterator.next() < 2) {
		 * linteger.add(iterator.next()); continue; } int j = iterator.next()/2; List
		 * sub = linteger.subList(j-1, j); System.out.println(sub);
		 * sub.set(j,iterator.next()); linteger.addAll(j, sub);
		 * 
		 * } System.out.println(linteger);
		 * 
		 */

	}
}
