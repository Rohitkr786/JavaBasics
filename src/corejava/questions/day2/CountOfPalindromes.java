package corejava.questions.day2;

import java.util.Arrays;
import java.util.Scanner;

public class CountOfPalindromes {

	public static void main(String[] args) {
		StringPalindrome sp = new StringPalindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String data = sc.nextLine();
		String arr[] = data.split(" ");
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (sp.isPalindrome(arr[i])) {
				System.out.println("Palindrome(s) in given String is : " + arr[i]);
				count++;
			}

		}
		System.out.println(" \n Count of Palindrome is : " + count);
	}

}
