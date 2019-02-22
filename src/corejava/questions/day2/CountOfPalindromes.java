package corejava.questions.day2;
//Write a program to  determine the count of palindromes in the given string.
import java.util.Arrays;
import java.util.Scanner;

public class CountOfPalindromes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String data = sc.nextLine();
		String arr[] = data.split(" ");
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (StringPalindrome.isPalindrome(arr[i])) {
				System.out.println("Palindrome(s) in given String is : " + arr[i]);
				count++;
			}

		}
		System.out.println(" ");
		System.out.println("Count of Palindrome is : " + count);
		sc.close();
	}

}
