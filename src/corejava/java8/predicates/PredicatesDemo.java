package corejava.java8.predicates;

import java.util.function.Predicate;

public class PredicatesDemo {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 7, 5, 3, 11, 17, 23, 47, 22 };

		Predicate<Integer> isEven = ele -> ele % 2 == 0;

		int count = check(isEven, arr);

		System.out.println(count);

		Predicate<Integer> isGreaterThan5 = ele -> ele > 12;

		count = check(isEven.and(isGreaterThan5), arr); // checks for even and num > 12

		System.out.println(count);

	}

	private static int check(Predicate<Integer> predicate, int[] arr) {
		int res = 0;
		for (int ele : arr) {
			if (predicate.test(ele)) {
				res++;
			}
		}
		return res;
	}

}
