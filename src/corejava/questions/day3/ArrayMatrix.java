package corejava.questions.day3;

import java.util.Scanner;

public class ArrayMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row or column size :");
		int m = sc.nextInt();
		int arr[][] = new int[m][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println("Enter element at " + i + "," + j);
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " "); // Displaying Given Matrix
			}
			System.out.println(" ");
		}
		sc.close();
		System.out.println("----------------START-------------------------");
		minMax(arr, m); 														// Finding Minimum and Maximum in given Matrix
		System.out.println("----------------------------------------------");
		minRow(arr, m); 														// Finding all Minimum elements in a row
		maxRow(arr, m); 														// Finding all Maximum elements in a row
		System.out.println("----------------------------------------------");
		minCol(arr, m); 														// Finding all Minimum elements in a Column
		maxCol(arr, m); 														// Finding all Maximum elements in a Column
		System.out.println("-----------------END--------------------------");
	}

	private static void minMax(int[][] arr, int m) {
		int minMax[] = new int[m * m];
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				minMax[c++] = arr[i][j];
			}
		}
		System.out.println("Minimum in given Matix is :- " + ArrayOperations.smallest(minMax)); //returns Smallest in given array
		System.out.println("Maximum in given Matix is :- " + ArrayOperations.biggest(minMax));	//returns biggest in given array

	}

	private static void maxCol(int[][] arr, int m) {
		int maxArr[] = new int[m * m];
		int c = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int k = 0; k < maxArr.length; k++) {
				maxArr[k] = 0;
			}
			for (int i = 0; i < arr.length; i++) {
				maxArr[c++] = arr[i][j];
			}
			if (j == 0)
				System.out.print("Maximum Column elements are :- ");
			System.out.print(ArrayOperations.biggest(maxArr) + " ");
			for (int k = 0; k < maxArr.length; k++) {
				maxArr[k] = 0;
			}
		}
		System.out.println(" ");
	}

	private static void minCol(int[][] arr, int m) {
		int minArr[] = new int[m * m];
		int c = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int k = 0; k < minArr.length; k++) {
				minArr[k] = 99999;
			}
			for (int i = 0; i < arr.length; i++) {
				minArr[c++] = arr[i][j];
			}
			if (j == 0)
				System.out.print("Minimum Column elements are :- ");
			System.out.print(ArrayOperations.smallest(minArr) + " ");
			for (int k = 0; k < minArr.length; k++) {
				minArr[k] = 99999;
			}
		}
		System.out.println(" ");
	}

	private static void maxRow(int[][] arr, int m) {
		int maxArr[] = new int[m * m];
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < maxArr.length; k++) {
				maxArr[k] = 0;
			}
			for (int j = 0; j < arr.length; j++) {
				maxArr[c++] = arr[i][j];
			}
			if (i == 0)
				System.out.print("Maximum row elements are :- ");
			System.out.print(ArrayOperations.biggest(maxArr) + " ");
			for (int k = 0; k < maxArr.length; k++) {
				maxArr[k] = 0;
			}
		}
		System.out.println(" ");
	}

	private static void minRow(int[][] arr, int m) {
		int minArr[] = new int[m * m];
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < minArr.length; k++) {
				minArr[k] = 99999;
			}
			for (int j = 0; j < arr.length; j++) {
				minArr[c++] = arr[i][j];
			}
			if (i == 0)
				System.out.print("Minimum row elements are :- ");
			System.out.print(ArrayOperations.smallest(minArr) + " ");
			for (int k = 0; k < minArr.length; k++) {
				minArr[k] = 99999;
			}
		}
		System.out.println(" ");

	}

}
