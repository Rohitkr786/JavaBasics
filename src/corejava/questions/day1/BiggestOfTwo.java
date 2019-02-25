package corejava.questions.day1;

import java.util.Scanner;

public class BiggestOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value Number 1 :");
		int a = sc.nextInt();
		System.out.println("Enter Value Number 2 :");
		int b = sc.nextInt();
		int big = biggestOfTwo(a, b); // Using terinary operator
		System.out.println("Big is :" + big);
		sc.close();
	}

	private static int biggestOfTwo(int a, int b) {
		return (a > b) ? a : b;
		/*
		 * (a>b) -- > if(a>b) , ? --> return a , : b --> else return b
		 */
	}

}
