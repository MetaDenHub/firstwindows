package eleven;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForEachCollections {
	public static void main(String[] args) {
		Collection<String> cs = new LinkedList<String>();
		Collections.addAll(cs, "One two three four five".split(" "));
		for (String s : cs) {
			System.out.print("'" + s + "' ");
		}
	}
}
