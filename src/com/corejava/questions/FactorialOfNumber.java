package com.corejava.questions;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to generate Factorial :");
		int n = sc.nextInt();
		System.out.println("Factorial of a given number is : " + factorial(n));
		sc.close();
	}

	private static int factorial(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * i;
		}
		return res;
	}

}
