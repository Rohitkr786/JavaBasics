package corejava.questions.day2;

import java.util.Arrays;
/* Write a method that accepts two parameters: an integer and an array of integers. 
 * Search for the entered integer value in the array of integers, 
 * and return “True” if present, “False” if not present. 
 * Use the following search techniques: Linear Search, Binary Search.*/
import java.util.Scanner;

public class SearchAlgorithms extends SortingTechniques {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		int arr[] = ArrayInput.arrayInput(n); //Array input from user
		while(true) {
		System.out.println("Enter key element to search : ");
		int key = sc.nextInt();
		System.out.println("1.Linear Search 2.Binary Serach : ");
		int c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("Key found : " + linaerSearch(arr, key));
			break;
		case 2:
			boolean bs = binarySearch(arr, key);
			System.out.println("Key found : " + bs);
			break;
		}
		}

	}

	public static boolean binarySearch(int[] arr, int key) {
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				return true;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else if (arr[mid] > key) {
				high = mid - 1;
			}
		}
		return false;
	}

	private static boolean linaerSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return true;
			}
		}
		return false;
	}
}
