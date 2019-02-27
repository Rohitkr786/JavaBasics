package corejava.questions.day3;

import java.util.Scanner;

public class ArrayMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size :");
		int m = sc.nextInt();
		System.out.println("Enter Column size :");
		int n = sc.nextInt();
		int arr[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter element at index " + (i + 1) + "," + (j + 1));
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " "); // Displaying Given Matrix
			}
			System.out.println(" ");
		}
		sc.close();
		System.out.println("----------------START-------------------------");
		minMax(arr, m, n); // Finding Minimum and Maximum in given Matrix
		System.out.println("----------------------------------------------");
		minRow(arr, m, n); // Finding all Minimum elements in a row
		maxRow(arr, m, n); // Finding all Maximum elements in a row
		System.out.println("----------------------------------------------");
		minCol(arr, m, n); // Finding all Minimum elements in a Column
		maxCol(arr, m, n); // Finding all Maximum elements in a Column
		System.out.println("-----------------END--------------------------");
	}

	private static void minMax(int[][] arr, int m, int n) {
		int minMax[] = new int[m * n];
		int c = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				minMax[c++] = arr[i][j];
			}
		}
		System.out.println("Minimum in given Matix is :- " + ArrayOperations.smallest(minMax)); // returns Smallest in
																								// given array
		System.out.println("Maximum in given Matix is :- " + ArrayOperations.biggest(minMax)); // returns biggest in
																								// given array

	}

	private static void maxCol(int[][] arr, int m, int n) {
		int maxArr[] = new int[m * n];
		int c = 0;
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < maxArr.length; k++) {
				maxArr[k] = 0;
			}
			for (int i = 0; i < m; i++) {
				maxArr[c++] = arr[i][j];
			}
			if (j == 0) {
				System.out.print("Maximum Column elements are :- ");
			}
			System.out.print(ArrayOperations.biggest(maxArr) + " ");

		}
		System.out.println(" ");
	}

	private static void minCol(int[][] arr, int m, int n) {
		int minArr[] = new int[m * n];
		int c = 0;
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < minArr.length; k++) {
				minArr[k] = 99999;
			}
			for (int i = 0; i < m; i++) {
				minArr[c++] = arr[i][j];
			}
			if (j == 0) {
				System.out.print("Minimum Column elements are :- ");
			}
			System.out.print(ArrayOperations.smallest(minArr) + " ");

		}
		System.out.println(" ");
	}

	private static void maxRow(int[][] arr, int m, int n) {
		int maxArr[] = new int[m * n];
		int c = 0;
		for (int i = 0; i < m; i++) {
			for (int k = 0; k < maxArr.length; k++) {
				maxArr[k] = 0;
			}
			for (int j = 0; j < n; j++) {
				maxArr[c++] = arr[i][j];
			}
			if (i == 0) {
				System.out.print("Maximum row elements are :- ");
			}
			System.out.print(ArrayOperations.biggest(maxArr) + " ");

		}
		System.out.println(" ");
	}

	private static void minRow(int[][] arr, int m, int n) {
		int minArr[] = new int[m * n];
		int c = 0;
		for (int i = 0; i < m; i++) {
			for (int k = 0; k < minArr.length; k++) {
				minArr[k] = 99999;
			}
			for (int j = 0; j < n; j++) {
				minArr[c++] = arr[i][j];
			}
			if (i == 0) {
				System.out.print("Minimum row elements are :- ");
			}
			System.out.print(ArrayOperations.smallest(minArr) + " ");

		}
		System.out.println(" ");

	}

}
