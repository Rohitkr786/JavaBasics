package corejava.questions.day2;

import java.util.Scanner;

public class IdentityMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of Row/Column to Print Identity Matrix : ");
		int n = sc.nextInt();
		sc.close();
		int identityMatrix[][] = getIdentityMatrix(n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(identityMatrix[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

	private static int[][] getIdentityMatrix(int n) {
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==j) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		return arr;
	}

}
