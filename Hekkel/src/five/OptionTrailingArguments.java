package five;

public class OptionTrailingArguments {
	static void f(int required, String... additional) {
		System.out.print("required: " + required + " ");
		for (String s : additional) {
			System.out.print(s + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		f(1, "one");
		f(2, "two");
		f(0);
	}

}
