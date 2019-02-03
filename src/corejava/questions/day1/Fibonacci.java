package corejava.questions.day1;

import java.util.Scanner;
//Question no=5
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to generate Fibonacci Series");
		int n = sc.nextInt();
		sc.close();
		int num1=0,num2=1;
		for(int i=1;i<=n;i++) {
			System.out.println(num1);
			int sum = num1+num2;
			num1=num2;
			num2=sum;
		}
		
	}

}
