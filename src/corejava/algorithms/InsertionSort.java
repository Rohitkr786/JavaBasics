package corejava.algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int size = 20, count = 0;
		int arr[] = new int[size];
		for (int i = size - 1; i >= 0; i--)
			arr[i] = ++count;
		System.out.println("Before Sort :- " + Arrays.toString(arr));
		insertionSort(arr, size);
		System.out.println("After Sort :-  " + Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr, int size) {
		int max, j;
		for (int i = 1; i < size; i++) {
			max = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > max) {
				arr[j + 1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = max;
		}
	}

}
