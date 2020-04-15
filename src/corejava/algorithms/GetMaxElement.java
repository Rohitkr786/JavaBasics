package corejava.algorithms;

import java.util.ArrayList;
import java.util.List;

public class GetMaxElement {

	public static void main(String[] args) {

		int slice = 3;
		List<Integer> list = new ArrayList<>(List.of(2, 3, 4, 5, 6, 2));
		System.out.println(list);
		int max = getMaxElement(list, slice);
		System.out.println("Res : " + max);
	}

	private static int getMaxElement(List<Integer> list, int slice) {
		int index = 0, max = 0;
		List<Integer> myList = new ArrayList<>();
		int j = 0, size = list.size(), k;
		for (int i = 0; i < 3; i++) {

			for (j = index, k = 0; k < slice; k++, j++) {
				myList.add(list.get(j));
			}

			int min = getMin(myList);
			max = Integer.max(min, max);
			myList.clear();
			if (index != 3) {
				index = slice - j;
			} else {
				index = 3;
			}
			System.out.println(index);

		}
		return max;
	}

	private static int getMin(List<Integer> list) {
		System.out.println("List : " + list);
		int min = list.get(0);
		for (int ele : list) {
			min = Integer.min(ele, min);
		}
		return min;
	}
}
