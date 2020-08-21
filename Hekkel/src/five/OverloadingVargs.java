package five;

public class OverloadingVargs {
	static void f(String ...strings ) {
		for (String string : strings) {
			System.out.print(string + " ");
		}
	}

	public static void main(String[] args) {
		f("SDF", "khjk","sdfrry");
		System.out.println();
		f(new String[] {"sd","sdf"});
	}

}
