package corejava.algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int size = 10, count = 0;
		int arr[] = new int[size];
		for (int i = size - 1; i >= 0; i--)
			arr[i] = ++count;
		System.out.println("Before Sort :- " + Arrays.toString(arr));
		selectionSort(arr, size);
		System.out.println("After Sort :-  " + Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr, int size) {
		int temp, min;
		for (int i = 0; i < size - 1; i++) {
			min = i;
			for (int j = min + 1; j < size; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

}
