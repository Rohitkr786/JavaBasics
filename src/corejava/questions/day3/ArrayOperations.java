package corejava.questions.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import corejava.questions.day2.ArrayInput;
import corejava.questions.day2.SearchAlgorithms;

public class ArrayOperations {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length : ");
		int n = sc.nextInt();
		int arr[] = ArrayInput.arrayInput(n); //Array Input from user
		int big = biggest(arr);
		System.out.println("Biggest element in a array  is " + big);
		int small = smallest(arr);
		System.out.println("Smallest element in a array  is " + small);
		int sum = sumOfArray(arr);
		System.out.println("Sum of an array  is " + sum);
		int avg = sum / arr.length;
		System.out.println("Average of an array  is " + avg);
		System.out.println("Enter key element to search :");
		int key = sc.nextInt();
		System.out.println("Key found is "+SearchAlgorithms.binarySearch(key,arr));
		System.out.println("Sorted array is :"+Arrays.toString(arr));
		int revArr[]=revArr(arr);
		System.out.println("Reversed array is : "+Arrays.toString(revArr));
		sc.close();
	}

	private static int[] suffleArr(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		return null;
	}

	private static int[] revArr(int[] arr) {
		int n = arr.length;
		int revArr[] = new int[n];
		int c = n - 1;
		for (int i = 0; i < n; i++) {
			revArr[c] = arr[i];
			c--;
		}
		return revArr;
	}

	private static int sumOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int smallest(int[] arr) {
		int small = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		return small;
	}

	public static int biggest(int[] arr) {
		int big = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > big) {
				big = arr[i];
			}
		}
		return big;
	}

}
