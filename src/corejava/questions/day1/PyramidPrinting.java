package corejava.questions.day1;

public class PyramidPrinting {

	public static void main(String[] args) {
		int rows = 5;
		printPyramid(rows);
	}

	private static void printPyramid(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int spaces = i; spaces <= rows - 1; spaces++) {
				System.out.print(" "); // for empty spaces
			}
			int col = 1;
			for (; col <= i; col++) {
				System.out.print(col); // print first half of Pyramid
			}
			while (col > 2) {
				col--;
				System.out.print(col - 1); // print second half of Pyramid
			}
			System.out.println(); // for next line
		}
	}

}
