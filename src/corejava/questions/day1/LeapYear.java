package corejava.questions.day1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year (YYYY) : ");
		n= sc.nextInt();
		sc.close();
		if(n%4==0)
			System.out.println("Leap year");
		else
			System.out.println("not leap year");

	}

}
