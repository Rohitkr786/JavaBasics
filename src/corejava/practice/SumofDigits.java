package corejava.practice;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		System.out.println("Sum of Digits is : "+SumOfDigits(n));
	}

	private static int SumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10; 				// n = n / 10;
		}
		return sum;
	}

}
