package tenKommandPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * 
 * Main class for saving Even's objects
 * 
 * */
public class Controller {
	private static List<Event> eventList = new LinkedList<Event>();

	public static void addEvent(Event c) {
		eventList.add(c);
	}
	Iterator<Event> iterator = eventList.iterator();
	public void run() {
		while (iterator.hasNext())
			for (Event event : new LinkedList<Event>(eventList)) // creating new array by this sentence
				if (event.ready()) {
					System.out.println(event);
					event.action();
					eventList.remove(event);
				}
	}
}
