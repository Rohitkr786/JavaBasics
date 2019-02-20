package corejava.questions.day2;

import java.util.Arrays;
import java.util.Scanner;

public class SortingTechniques {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 5, 4, 9, 7, 8, 3, 2 };
		bubbleSort(arr);
		System.out.println("Sorting using bubble sort : "+Arrays.toString(arr));
	}

	public static int[] bubbleSort(int[] arr) {
		int temp, n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;

	}
	
	

}
