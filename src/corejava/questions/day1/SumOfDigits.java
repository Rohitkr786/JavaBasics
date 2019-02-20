package corejava.questions.day1;

/*Write a program to accept a number from the user and determine the sum of digits of that number. 
 * Repeat the operation until the sum gets to be a single digit number.
 * */
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		sc.close();
		int sum = 0;
		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("Sum of Digits in given digits is : " + sum);
	}

}
