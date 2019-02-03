package corejava.questions.day1;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check to prime or not");
		int num = sc.nextInt();
		System.out.println(Arrays.toString(getPrimes(num)));
		if (isPrime(num)) {
			System.out.println("Prime Number");
		} else {
			System.out.println(num + " is not a prime number");
		}
		System.out.println("------------------------------------------------");

		System.out.println("Enter the lower bound limit :");
		int lb = sc.nextInt();
		System.out.println("Enter the Upper bound limit");
		int ub = sc.nextInt();
		sc.close();

		System.out.println("------------------------------------------------");
		System.out.println(Arrays.toString(primeRanges(lb, ub)));

	}

	private static int primeRangesCount(int lb, int ub) {
		int count = 0;
		while (lb < ub) {
			if (isPrime(lb)) {
				count++;
			}
			lb++;
		}
		return count;

	}

	private static int[] primeRanges(int lb, int ub) {
		int arrLength = primeRangesCount(lb, ub);
		int arr[] = new int[arrLength];
		int count=0;
		while (lb < ub) {
			if (isPrime(lb)) {
				arr[count++] = lb;
				//System.out.print(lb + " ");
			}
			lb++;
		}
		return arr;
	}

	private static int[] getPrimes(int n) {
		int arr[] = new int[n];
		int c = 0;
		for (int i = 2;; i++) {
			if (isPrime(i)) // first check wheather it is prime or not
			{
				arr[c++] = i;
			}
			if (c == n) {
				break;
			}
		}
		return arr;
	}

	private static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
