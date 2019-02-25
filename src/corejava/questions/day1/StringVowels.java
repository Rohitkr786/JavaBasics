package corejava.questions.day1;

import java.util.Scanner;

public class StringVowels {
//Write a program to find the number of vowels and consonants in the given string.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.nextLine().toLowerCase();
		int len = str.length();
		System.out.println("Given String length is "+len);
		int vowelCount = 0,consonantsCount=0;
		for(int i=0;i<len;i++) {
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowelCount++;
			}
			else if(c>='a'&&c<='z') {
				consonantsCount++;
			}
		}
		System.out.println("Vowels Count is :" + vowelCount);
		System.out.println("Consonants Count is :" + consonantsCount);
		sc.close();
		
	}
	

}
