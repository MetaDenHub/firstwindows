package algorithms;

import java.util.Arrays;


public class SelectionSort {
	public static void main(String[] args) {
		int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            SelectionSorter.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
	}

}

class SelectionSorter {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int min_position = i;
            int min_value = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min_value) {
                    min_position = j;    // pos - индекс наименьшего элемента
                    min_value = array[j];
                }
            }
            array[min_position] = array[i];
            array[i] = min_value;    // меняем местами наименьший с array[i]
        }
    }
}