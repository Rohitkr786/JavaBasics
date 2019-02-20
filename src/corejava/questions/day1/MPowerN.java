package corejava.questions.day1;

import java.util.Scanner;

/*Write a program to accept 2 numbers “m” and “n” from the user, and 
 * determine the value of m^n without using predefined functions
 */

public class MPowerN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m :");
		int m = sc.nextInt();
		System.out.println("Enter n :");
		int n = sc.nextInt();
		int temp;
		int pro = 1;
		for (int i = 1; i <= n; i++) {
			temp = m;
			pro *= temp;

		}
		System.out.println("m power n is " + pro);
	}

}
