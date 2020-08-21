package eleven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

class Gerbill {
	private int gerbilNumber;
	private static int counter = 0;
	public Gerbill() {
		gerbilNumber = counter++;
		
	}
	public void hop() {
		System.out.println("short message =) " + gerbilNumber);
	}
	
}

public class Gerbil {
	static int j = 0;
	public static void main(String[] args) {
		Map<String, Gerbill> gerMap = new HashMap<String, Gerbill>();
		for (int i = 0; i < 5; i++) {
			gerMap.put(getString(), new Gerbill());
		}
		
		Iterator<String> iterator = gerMap.keySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

//		for(int i = 0; i < 5; i++)
//			aaa[i]=i;
//		System.out.println(Arrays.toString(aaa));
//		serAaa(aaa);
//		System.out.println(Arrays.toString(aaa));
		
		
		HashSet<String> countryHashSet = new HashSet<>();
	    countryHashSet.add("Россия");
	    countryHashSet.add("Кот-Д'Ивуар"); // любимая страна всех котов
	    countryHashSet.add("Франция");
	    countryHashSet.add("Гондурас");
	    countryHashSet.add("Кот-Д'Ивуар"); // кот попросил добавить ещё раз для надёжности

//	    Iterator<String> iterator = countryHashSet.iterator();
	    
	    
//	    while (iterator.hasNext()) {
//	        System.out.println(countryHashSet+iterator.next());
//	    }
	}
	private static String getString() {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("First");
		arr.add("Second");
		arr.add("Third");
		arr.add("Fourth");
		arr.add("Fifth");
		return arr.get(j++);
	}
	static int[] serAaa(int[] aaa) {
		int[] bbb = aaa;//new int[5];
		for(int i = 0; i < aaa.length; i++)
			for(int j = 0; j < aaa.length-1; j++) {
				if(aaa[j+1] > aaa[i])
					bbb[j] = aaa[j+1];
					aaa[j] = aaa[i];
					aaa[i] = bbb[j];
			}	
		
		return aaa;
	}
	
}
