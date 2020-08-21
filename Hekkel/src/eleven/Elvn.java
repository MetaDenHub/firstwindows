package eleven;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

interface OneTwo extends Comparable<OneTwo> {
	@Override
	String toString();
}

class One implements OneTwo {
	int id;
	String str;
	public One(int id, String str){
		this.id = id;
		this.str = str;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "One!";
	}
	@Override
	public int compareTo(OneTwo o) {
		// TODO Auto-generated method stub
		return 1;
	}
}

class Two implements OneTwo {
	int id;
	String str;
	public Two(int id, String str){
		this.id = id;
		this.str = str;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Two!";
	}
	@Override
	public int compareTo(OneTwo o) {
		// TODO Auto-generated method stub
		return 1;
	}
}

public class Elvn {
	public static void main(String[] args) {
		Set<OneTwo> oae = new TreeSet<>();
		oae.add(new One(12, "sdf"));
		oae.add(new Two(21,"dsf"));
		print(oae.iterator());
		LinkedList<OneTwo> aeo = new LinkedList<>();
		aeo.add(new One(3, "sd"));
		aeo.add(new Two(3, "ds"));
		print(aeo.iterator());
		System.out.println();
		PriorityQueue<OneTwo> pot = new PriorityQueue<OneTwo>();
		pot.add(new One(0, null));
		pot.add(new Two(0,"sdf"));
		print(pot.iterator());
		
		
	}

	static void print(Iterator<OneTwo> it) {
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
