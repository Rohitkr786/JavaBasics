package corejava.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SubArray {

	public static void main(String[] args) {
		int x = 2;
		int[] arr = { 8, 2, 4};
		int res = numComps(arr, x);
		System.out.println(res);
	}

	private static int numComps(int[] arr, int x) {
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i <= arr.length / x; i++) {
			int[] sliced = getSlice(arr, i, x + i);
			Arrays.sort(sliced);
			set.add(sliced[0]);
		}
		return set.last();
	}

	private static int[] getSlice(int[] arr, int i, int x) {
		return Arrays.copyOfRange(arr, i, x);
	}

}
