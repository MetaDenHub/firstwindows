package ten;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Example of Iterator template
 * 
 * */

interface Selector {
	boolean end();

	Object current();

	void next();
}

public class Sequence {
	private ArrayList<Object> items = new ArrayList<>();

	public Sequence() {
	}

	public void add(Object x) throws OutOfMemoryError {
		try {
			items.add(x);
			
		} catch (OutOfMemoryError e) {
			e.printStackTrace(System.out);
		}
	}

	private class StrClass {
		String str = "Hello!";

		public String toString() {
			return "Hi! I am a programmer from Ukraine! :) " + "I become best of the best!";
		}
	}

	private class SequenceSelector implements Selector {
		Sequence getSeq() {
			return Sequence.this;
		}

		private int i = 0;

		@Override
		public boolean end() {

			return i >= items.size();

		}

		@Override
		public Object current() {
			return items.get(i);
		}

		@Override
		public void next() {
			if (!items.isEmpty())
				i++;

		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}

	static int x1 = 10;

	public static void main(String[] args) {
		Sequence sequence = new Sequence();
		for (int i = 0; i < 1000000000; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		StrClass strrr = sequence.new StrClass();
		System.out.println(strrr);

		System.out.print(x1);

	}

}
