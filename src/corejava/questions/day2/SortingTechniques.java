package corejava.questions.day2;

//Learn and implement the following sorting techniques: Bubble Sort, Insertion Sort, Merge Sort
import java.util.Arrays;
import java.util.Scanner;

public class SortingTechniques {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 5,2,3,6,1 };
		bubbleSort(arr);
		sc.close();
		System.out.println("Sorting using bubble sort : " + Arrays.toString(arr));
	}

	public static int[] bubbleSort(int[] arr) {
		int temp, n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;

	}

}
