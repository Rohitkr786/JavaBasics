package com.corejava.questions;

public class BigOf3 {

	public static void main(String[] args) {
		int a = 16, b = 20, c = 17, big;

		if ((a > b) && (a > c))
			big = a;

		else if (b > c)
			big = b;
		else
			big = c;

		System.out.println("Biggest number is"+big);	
	}
}
