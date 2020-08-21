package five;

public class NewVarArgs {
	static void printArray(Object... args) {
		for (Object object : args)
			System.out.print(object + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// separate args
		printArray(new Integer(47), new Float(3.14), new Double(11.11));
		printArray(47, 3.14f, 11.11);
		printArray("one", "two", "three");
		printArray(new A(), new A(), new A());
		// or arrays
		printArray((Object[]) new Integer[] { 1, 2, 3, 4 });
		printArray();
	}

}
