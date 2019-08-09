package corejava.algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int size = 20, count = 0;
		int arr[] = new int[size];
		for (int i = size - 1; i >= 0; i--)
			arr[i] = ++count;
		System.out.println("Before Sort :- " + Arrays.toString(arr));
		bubbleSort(arr, size);
		System.out.println("After Sort :-  " + Arrays.toString(arr));
	}

	public static void bubbleSort(int arr[], int size) {
		int temp;
		for (int i = 0; i < size ; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
