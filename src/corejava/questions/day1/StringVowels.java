package corejava.questions.day1;

import java.util.Scanner;

public class StringVowels {
//Write a program to find the number of vowels and consonants in the given string.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.nextLine();
		int len = str.length();
		System.out.println("Given String length is "+len);
		String VOWELS = "aeiouAEIOU";
		int vl = VOWELS.length();
		int vowelCount = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < vl; j++) {
				if (str.charAt(i) == VOWELS.charAt(j)) {
					vowelCount = vowelCount + 1;
				} 
			}
		}
		System.out.println("Vowels Count is :" + vowelCount);
		//int consonantsCount = len-vowelCount;
		//System.out.println("Consonants Count is :" + consonantsCount);
		sc.close();
		
	}
	

}
