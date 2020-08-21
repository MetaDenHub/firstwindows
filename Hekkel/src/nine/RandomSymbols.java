package nine;

import java.util.Random;

public class RandomSymbols {
	static Random rand = new Random(47);
	public static int next() {
		return rand.nextInt(7);
	}
	
	public static void main(String[] args) {
		int i = 93;
		Character c = (char) i;
		int s = next();
		char ch = (char)s;
		System.out.println(c);
		System.out.println(ch);
	}
}
