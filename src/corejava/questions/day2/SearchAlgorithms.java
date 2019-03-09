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
			System.out.println("Array elements :- "+Arrays.toString(arr));
			System.out.println("Key found : " + linaerSearch(arr, key));
			System.out.println("Key postion is : " + linaerSearch(key, arr));
			break;
		case 2:
			boolean bs = binarySearch(arr, key);
			System.out.println("Array elements :- "+Arrays.toString(arr));
			System.out.println("Key found : " + bs);
			int pos =binarySearch(key,arr);
			System.out.println("Positon is "+pos);
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
	
	public static int binarySearch(int key,int[] arr) {
		Arrays.sort(arr);
		int low = 0,pos=-1;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				pos=mid+1;
				return pos;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else if (arr[mid] > key) {
				high = mid - 1;
			}
		}
		return pos;
	}

	private static boolean linaerSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return true;
			}
		}
		return false;
	}
	private static int linaerSearch(int key,int[] arr) {
		int pos=-1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				pos =i+1;
				return pos;
			}
		}
		return pos;
	}
}
