package corejava.questions.day2;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word to check Palindrome :");
		String s = sc.next();
		int mid = s.length() / 2;
		int l = s.length() - 1;
		System.out.println(palindrome(s, l, mid)); 		// Checking Palindrome using Method !
		System.out.println(" ");
		System.out.println(isPalindrome(s)); 					// Checking Palindrome using StringBuffer Method
		sc.close();
	}

	public static boolean palindrome(String s, int len, int mid) {
		for (int i = 0; i <= mid; i++) {
			if (s.charAt(i) != s.charAt(len--)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrome(String s) {
		return new StringBuffer(s).reverse().toString().equals(s);
	}
}
