package five;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {

	public static void main(String[] args) {
		int[] a;
		Random rand = new Random(47);
		a = new int[rand.nextInt(2)];
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		Integer[] aa = new Integer[rand.nextInt(20)];
		System.out.println("aa.length = " + aa.length);
		for(int i = 0; i < aa.length; i++)
			aa[i] = rand.nextInt(200);
		System.out.println(Arrays.toString(aa));
	}
}
