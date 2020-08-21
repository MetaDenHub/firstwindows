package eleven;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/*
 * 
 * getting all linkedHashMap's entryes to treeMap and sorting it
 * 
 * 
 * 
 * */

public class LinkedMap {
	public static void main(String[] args) {
		LinkedHashMap<String, String> limp = new LinkedHashMap<String, String>();
		limp.put("A", "abstract");
		limp.put("B", "bear");
		limp.put("C", "celebrait");
		limp.put("E", "eeeerockk");
		limp.put("D", "destroy");
		System.out.println(limp);
		Set<String> set = new HashSet<String>();
		set.addAll(limp.keySet());
		System.out.println(set);

		Map<String, String> mmap = new TreeMap<String, String>();
		mmap.putAll(limp);
		System.out.println(mmap);
		limp.clear();
		limp.putAll(mmap);
		System.out.println(limp);
	}
}
