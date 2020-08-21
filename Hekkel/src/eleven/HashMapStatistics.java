package eleven;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
 * 
 * testing HashMap
 * 
 * */

public class HashMapStatistics {
	public static void main(String[] args) {
		Random rand = new Random();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i = 1; i < 10000; i++) {
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r,freq == null ? i : freq + 1);
		}
		System.out.println(m);
	}
}
