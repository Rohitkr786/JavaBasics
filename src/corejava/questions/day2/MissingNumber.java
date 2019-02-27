package corejava.questions.day2;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		int arr[] = ArrayInput.arrayInput(n);
		Arrays.sort(arr); // Sorting of array
		System.out.println("Sorted Array :- "+Arrays.toString(arr));
		int c = 0;
		for (;;) {
			int pre = arr[c];
			int next = arr[c + 1];
			if ((pre + 1) != next) {
				System.out.println("Missing Number is " + (pre + 1));
			}
			c++;
			if (c == arr.length - 1) {
				break;
			}
		}
		sc.close();
	}

}
