package eleven;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 
 * one more simple queue
 * 
 * */

class PutCommands {
	public static Queue<Command> putCommands() {
		Queue<Command> queue = new LinkedList<Command>();
		queue.add(new Command());
		queue.add(new Command());
		queue.add(new Command());
		queue.add(new Command());
		return queue;
	}
}

class PrintCommands {
	public void printCommands(Queue<Command> queue) {
		for (Command command : queue) {
			System.out.println(Command.operation());
		}
	}
}

public class Command {

	static String operation() {
		return "Hello!";
	}

	public static void main(String[] args) {
		PrintCommands pricomds = new PrintCommands();
		pricomds.printCommands(PutCommands.putCommands());
	}
}
