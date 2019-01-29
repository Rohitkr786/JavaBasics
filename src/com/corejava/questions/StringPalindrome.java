package com.corejava.questions;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word to check Palindrome :");
		String s = sc.next();
		sc.close();
		int mid = s.length() / 2;
		int l = s.length() - 1;
		System.out.println(isPalindrome(s, l, mid)); 		// Checking Palindrome using Method !
		System.out.println(" ");
		System.out.println(palindrome(s)); 					// Checking Palindrome using Method 2
	}

	private static boolean isPalindrome(String s, int len, int mid) {
		for (int i = 0; i <= mid; i++) {
			if (s.charAt(i) != s.charAt(len--)) {
				return false;
			}
		}
		return true;
	}

	private static boolean palindrome(String s) {
		return new StringBuffer(s).reverse().toString().equals(s);
	}
}
