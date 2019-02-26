package corejava.questions.day3;

import java.util.Random;

public class Number {
	// a+b+c+d=12
	// a-b=c
	// a+c=d
	public static void main(String[] args) {
		int sum, a, b, c, d;
		Random rd = new Random();
		while (true) {
			a = rd.nextInt(10);
			b = rd.nextInt(10);
			c = rd.nextInt(10);
			d = rd.nextInt(10);
			/*
			 * System.out.println(a+" "+b+" "+" "+c+" "+d);
			 * System.out.println("------------------");
			 */
			sum = a + b + c + d;
			if (sum == 12) {
				System.out.println("success");
				System.out.println(a + " " + b + " " + " " + c + " " + d);
				break;
			}
			if(a-b==c) {
				
			}
		}
		

	}

}
