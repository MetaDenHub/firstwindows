package elevenExs;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Maps {
	public static void main(String[] args) {

		Map<Integer, String> maps = new HashMap<Integer, String>();
		maps.put(1, "one");
		maps.put(2, "two");
		maps.put(3, "three");
		maps.put(4, "four");
		System.out.println(maps.keySet());

		Set<Entry<Integer, String>> entries = maps.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
		}

		TreeMap<Integer, String> sorted = new TreeMap<>(maps);
		Set<Entry<Integer, String>> mappings = sorted.entrySet();
		for (Entry<Integer, String> entry : mappings) {
			System.out.println(entry.getKey());
		}
		HashMap<Integer, String> h = sortByKeys(maps);

		Set set2 = h.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterator2.next();
			System.out.print(me2.getKey() + ": ");
			System.out.println(me2.getValue());
		}

		// Collections.so;
	}

	private static HashMap sortByKeys(Map<Integer, String> maps) {
		List list = new LinkedList(maps.entrySet());
		// Defined Custom Comparator here
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getKey()).compareTo(((Map.Entry) (o2)).getKey());
			}
		});

		// Here I am copying the sorted list in HashMap
		// using LinkedHashMap to preserve the insertion order
		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}
}
