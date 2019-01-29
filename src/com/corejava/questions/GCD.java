package com.corejava.questions;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("program to find GCD of 2 numbers ");
		System.out.println("Enter Number 1:");
		int a = sc.nextInt();
		System.out.println("Enter Number 2");
		int b = sc.nextInt();
		sc.close();
		System.out.println("GCD of given number are : " + getGCD(a, b));
	}

	private static int getGCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return getGCD(b, a % b);
		}

	}

}
