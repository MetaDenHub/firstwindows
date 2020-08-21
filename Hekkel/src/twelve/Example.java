package twelve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class Thr extends Throwable {
}

public class Example {
	
		
	public static void main(String[] args) {
		List<Thr> t = new ArrayList<Thr>();
		for (int i = 0; i < 3; i++)
			t.add(new Thr());
		Iterator<Thr> it = t.iterator();
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println(it.next());
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace(System.out);
		}
	}
}
