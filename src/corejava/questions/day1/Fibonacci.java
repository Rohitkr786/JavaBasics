package corejava.questions.day1;

/*Write a program to print the Fibonacci series up to the number 34. 
(Example: 0,1,1,2,3,5,8,13,… The Fibonacci Series always starts with 0 and 1, the numbers 
that follow are arrived at by adding the 2 previous numbers.)
*/
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to generate Fibonacci Series");
		int n = sc.nextInt();
		sc.close();
		int num1 = 0, num2 = 1;
		for (int i = 1; i <= n; i++) {
			System.out.println(num1);
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}

	}

}
