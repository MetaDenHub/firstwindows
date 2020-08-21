package eleven;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class SimpleCollection {
	public static void main(String[] args) {
		Collection<Integer> arr = new LinkedHashSet<Integer>();
		for(int i = 0; i < 10; i++)
			arr.add(i);
		for (Integer i : arr) {
			System.out.println(i);
		}
		
	}
}
