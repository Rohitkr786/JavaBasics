package corejava.algorithms;

public class ActivateFountain {

	public static void main(String[] args) {
		int arr[] = { 2, 0, 0, 0, 0 };
		int len = arr.length;
		System.out.println(findMinActivatedFountain(arr, len));
	}

	public static int findMinActivatedFountain(int[] arr, int n) {
		int[] interval = new int[n];
		int count = 1;

		// At each index we'll store the max right possible from this index.
		for (int i = 1; i <= n; i++) {
			int left = Math.max(i - arr[i - 1], 1);
			int right = Math.min(i + arr[i - 1], n);

			interval[left - 1] = right;
		}

		int right = interval[0];
		int currMax = right;
		for (int i = 1; i < n; i++) {
			currMax = Math.max(currMax, interval[i]);

			// If the last fountain can cover only this point, then update with next
			// fountain.
			if (i == right) {
				count++;
				right = currMax;
			}
		}
		return count;
	}

}
