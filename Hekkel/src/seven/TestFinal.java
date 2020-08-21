package seven;

import java.util.Random;

public class TestFinal {
	private static Random rnd = new Random();
	static final Integer NON_STAT_FIN = rnd.nextInt(20);
	final Integer III = rnd.nextInt(20);
	public static void main(String[] args) {
		TestFinal t = new TestFinal();
	System.out.println(t.NON_STAT_FIN + " " + t.III);
	TestFinal t1 = new TestFinal();
	System.out.println(t1.NON_STAT_FIN + " " + t1.III);
	
	}

}
