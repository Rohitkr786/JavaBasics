package corejava.questions.day1;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to generate Sum of Series :");
		int n = sc.nextInt();
		float sum = 0;
		for (int i = 1; i < n; i++) {
			sum += (float) 1 / i;
		}
		System.out.println("Sum of Series is : "+sum);
	}

}
