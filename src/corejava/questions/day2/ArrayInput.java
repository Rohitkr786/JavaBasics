package corejava.questions.day2;

import java.util.Scanner;

public class ArrayInput {

	public static int[] arrayInput(int n) {
		int arr[] = new int[n];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Array Element at " + i);
			arr[i] = sc.nextInt();
		}
		return arr;
	}
}
