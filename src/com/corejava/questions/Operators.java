package com.corejava.questions;


public class Operators extends Object {

	public static void main(String[] args) {
		int a = 10;
		int b = ++a; // a=11 preincrement
		System.out.println(b);
		
		b = a++; // a=12 but b is 11 as it is postincrement
		System.out.println(b);

		--a;
		System.out.println(a);

		a--;
		System.out.println(a);
	}

}
