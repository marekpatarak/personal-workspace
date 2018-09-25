package w3school.basic;

import java.util.Arrays;

public class MergeSortArrays {

	public static void main(String[] args) {
		int[] array1 = { 1, 4, 5, 9, 3 };
		int[] array2 = { 2, 8, 9, 6, 7, 10 };
		int[] merge;
		int n;

		// vytvorenie noveho pola o dlzke suctu poli array1 a array2
		n = array1.length + array2.length;
		merge = new int[n];
		
		// prenesenie prvkov z pola array1 do merge
		for (int i = 0; i < array1.length; i++) {
			merge[i] = array1[i];
		}
		// prenesenie prvkov z pola array2 do merge
		for (int i = array1.length; i < (array1.length + array2.length); i++) {
			merge[i] = array2[i - array1.length];
		}

		// vytriedenie pola merge
		Arrays.sort(merge);
		
		// vypisanie prvkov pola merge
		for (int i = 0; i < merge.length; i++) {
			System.out.print(merge[i] + " ");
	

		}

	}
}

