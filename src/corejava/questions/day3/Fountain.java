package corejava.questions.day3;

public class Fountain {

	public static void main(String[] args) {
		int arr[] = { 1,2,1};
		int len = arr.length;
		getRes(arr, len);
	}

	private static void getRes(int[] arr, int len) {
		int maxRange = 0;
		for (int i = 1; i <= len; i++) {
			int range = getRange(i, arr[i - 1], len);
			if (range > maxRange) {
				maxRange = range;
			}
		}
		System.out.println(maxRange);
	}

	private static int getRange(int i, int j, int len) {
		int max = Integer.max(i - j, 1);
		int min = Integer.min(i + j, len);
		return Math.abs(max - min);
	}

}
