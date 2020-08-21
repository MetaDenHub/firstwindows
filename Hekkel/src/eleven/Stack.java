package eleven;
//
//
//	input - eleven.StackTest.java
//	parameterized types
//
//
import java.util.LinkedList;

public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	public void push(T v) {
		storage.addLast(v);
	}
	public T peek() {
		return storage.getFirst();
	}
	public T pop() {
		System.out.print(storage.getFirst());
		return storage.removeFirst();
	}
	public boolean empty() {
		return storage.isEmpty();
	}
	@Override
	public String toString() {
		return storage.toString();
	}
}
