package corejava.multithreading;

import java.util.Scanner;

public class SumOfNnumbersUsingThread extends Thread {
	private static Scanner sc = new Scanner(System.in);
	private static int n, sum = 0;

	public static void main(String[] args) throws InterruptedException {
		SumOfNnumbersUsingThread obj = new SumOfNnumbersUsingThread();

		System.out.println("Sum of N Number using threads");
		System.out.println("Enter a number :");
		SumOfNnumbersUsingThread.n = sc.nextInt();

		obj.start();
		obj.join(); /*
					 * obj.join(); -> this method prevents execution going next line untill the current
					 * thread come dead state or try commenting this line and check the result
					 */

		System.out.println("Sum is " + SumOfNnumbersUsingThread.sum);
	}

	public void run() {
		System.out.println("In run Method ");
		for (int i = 1; i <= SumOfNnumbersUsingThread.n; i++) {
			SumOfNnumbersUsingThread.sum += i;
		}
	}

}
