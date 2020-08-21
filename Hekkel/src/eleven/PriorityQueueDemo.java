package eleven;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

/*
 * 
 * PriorityQueueDemo
 * 
 * */
public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++)
			priorityQueue.offer(rand.nextInt(i + 10));
		QueueDemo.printQ(priorityQueue);

		List<Integer> ints = Arrays.asList(2, 32, 34, 12, 4, 5, 2, 3, 4, 23, 4, 24, 24);
		priorityQueue = new PriorityQueue<Integer>(ints);
		QueueDemo.printQ(priorityQueue);
		priorityQueue = new PriorityQueue<Integer>(ints.size(), Collections.reverseOrder());
		priorityQueue.addAll(ints);
		QueueDemo.printQ(priorityQueue);

		String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
		List<String> strings = Arrays.asList(fact.split(" "));
		PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings);
		QueueDemo.printQ(stringPQ);
		stringPQ = new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
		stringPQ.addAll(strings);
		QueueDemo.printQ(stringPQ);

		Set<Character> charSet = new HashSet<Character>();
		for (char c : fact.toCharArray())
			charSet.add(c);
		PriorityQueue<Character> characterPQ = new PriorityQueue<Character>(charSet);
		QueueDemo.printQ(characterPQ);

		///

		PriorityQueue<Double> pdouble = new PriorityQueue<Double>();
		for (int i = 0; i < 10; i++) {
			pdouble.offer(rand.nextDouble());
		}
		for (int i = 0; i < pdouble.size(); i++) {
			System.out.print(pdouble.poll() + " ");

		}

	}

}

class Sample extends Object {

}