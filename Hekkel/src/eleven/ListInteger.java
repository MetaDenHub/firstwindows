package eleven;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInteger {
	public static void main(String[] args) {
		List<Integer> li1 = new ArrayList<Integer>(5);
		for (int i=0; i<5; i++) {
			li1.add(i);
		}
		
		List<Integer> li2 = new ArrayList<>(5);
		ListIterator<Integer> it = li1.listIterator(li1.size());
		while(it.hasPrevious()) {
			
			li2.add(it.previous());
		}
		
		System.out.println(li1);
		System.out.println(li2);
	}
}
