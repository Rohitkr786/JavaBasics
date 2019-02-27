package corejava.questions.day3;

import java.util.Scanner;

import corejava.questions.day2.ArrayInput;

public class SuffleArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int n=sc.nextInt();
		int arr[]=ArrayInput.arrayInput(n);
		suffleArray(arr);
		sc.close();
	}

	private static void suffleArray(int[] arr) {
		swap(arr[0],arr[2]);
	}

	private static void swap(int i, int j) {
		
		
	}

}
