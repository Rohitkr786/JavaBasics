package com.corejava.questions;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check Palindrome :");
		int num = sc.nextInt();
		sc.close();
		int rev = isPalindrome(num);
		if (num == rev) {
			System.out.println("The Given number is Palindrome :" + rev);

		} else {
			System.out.println("The Given number is Not Palindrome...");
		}
	}

	private static int isPalindrome(int num) {
		int rev = 0;
		while (num != 0) {
			int reminder = num % 10;
			rev = rev * 10 + reminder;
			num /= 10;
		}
		return rev;
	}

}
