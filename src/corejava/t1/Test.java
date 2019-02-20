package corejava.t1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = { 5, 4, 1, 3, 0 };
        System.out.println(Arrays.toString(sortArray(a)));
    }

    public static int[] sortArray(int[] nonSortedArray) {
        int[] sortedArray = new int[nonSortedArray.length];
        int temp;

        for (int i = 0; i < nonSortedArray.length - 1; i++) {
            if (nonSortedArray[i] > nonSortedArray[i + 1]) {
                temp = nonSortedArray[i];
                nonSortedArray[i] = nonSortedArray[i + 1];
                nonSortedArray[i + 1] = temp;
                sortedArray = nonSortedArray;
            }
        }

        return sortedArray;
    }
}
