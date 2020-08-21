package eleven;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Statistics {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[10];
		int[] listRand = new int[10];
		int[] list = new int[10];
		for (int i = 0; i < 10; i++) {
			listRand[i] = rand.nextInt(10);
			list[i] = i;
		}
		// Iterator<Integer> iterator = list.iterator();
		// Iterator<Integer> iterator1 = list1.iterator();

		for (int k = 0; k < 10; k++) {
			int i = 0;
			for (int j = 0; j < 10; j++) {
				if (list[k] == listRand[j]) {
					arr[k] = ++i;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < listRand.length; i++) {
			System.out.print(listRand[i]);
		}

		int max = 0;
		int maxmax = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] >= arr[j] && arr[i] >= max)
					max = arr[i];
				else if (arr[i] <= arr[j] && arr[j] >= max)
					max = arr[j];
			}
			if(max>maxmax)
				maxmax = max;
		}
		System.out.println(" „аще всего встречаетьс€ " + maxmax + "-й елемент со значением " + arr[max]);

	}
}
