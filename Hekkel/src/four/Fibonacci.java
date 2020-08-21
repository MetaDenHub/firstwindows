package four;

import java.io.IOException;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		System.out.println(i);
		int[] arr = new int[i];
		for (int j = 0; j < arr.length; j++) {
			arr[j] = j;
			System.out.print(arr[j] + " ");

		}

		System.out.println();
		for (int j = 0; j < arr.length; j++) {
			if (j == 0) {
				System.out.println(j + " ");
				continue;
			}
			if(j==1) {
				System.out.println(j+" ");
				if(j!=arr.length-1)arr[j+1] = 1;
				continue;
			}
			if(j==2) {
				System.out.println(j+" ");
				if(j!=arr.length-1)arr[j+1] = 2;
				continue;
			}
			if(j==3) {
				System.out.println(j+" ");
				if(j!=arr.length-1)arr[j+1] = 3;
				continue;
			}
			int res = arr[j-1] + arr[j];
			System.out.println(res);
			if(j!=arr.length-1)arr[j+1] = res;
		}
		s.close();
	}

}
