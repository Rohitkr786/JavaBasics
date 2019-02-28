package corejava.questions.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String data = sc.nextLine();
		String arr[] = data.split(" ");
		/*
		 * int n = arr.length; String arrCopy[] = new String[n]; for (int i = 0; i < n;
		 * i++) { arrCopy[i] = arr[i]; }
		 */
		// frequencyOfWord(arr, arrCopy);
		frequencyOfWord(arr);
		sc.close();

	}

	private static void frequencyOfWord(String[] arr) {
		Map<String, Integer> map = new HashMap<>();
		for (String key : arr) {
			if (map.get(key) == null) {
				map.put(key, 1);
			} else {
				int count = map.get(key);
				count += 1; // increment count
				map.put(key, count);
			}
		}
		Set<Entry<String, Integer>> entry = map.entrySet();
		for (Entry<String, Integer> e : entry) {
			System.out.println("Frequency of " + e.getKey() + " is " + e.getValue());
		}
	}

	private static void frequencyOfWord(String[] arr, String[] arrCopy) {
		int count = 0, n = arr.length;
		// String arrScanned[] = new String[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i].equals(arrCopy[j])) {
					count++;
					// arrScanned[i]=arr[i];
				}
			}
			System.out.println("The frequency of word " + arr[i] + "  is " + count);
			count = 0;
		}
	}

}
