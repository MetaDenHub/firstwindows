package four;

import java.util.Random;

public class Rands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		// int i1 = rn.nextInt(100);
		// int i2 = rn.nextInt(100);
		int c = 0;
		for (int i = 0; i < 25; i++) {
			if (c == 3) {
				c = 0;
				System.out.println();
			}

			int i1 = rn.nextInt(100);
			int i2 = rn.nextInt(100);
			if (i1 > i2) {
				System.out.print("i1 > i2;   ");
			} else if (i1 < i2) {
				System.out.print("i1 < i2;   ");
			}
			c++;
		}
		c = 0;
		System.out.println();
		System.out.println();
		for (int i = 0; i < 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if (((rn.nextInt(100)) % j) == 0) {
					System.out.print(j + ";  ");
					if (c == 10) {
						c=0;
						System.out.println();
					}
					c++;
				}

			}
			
		}
	}

}
