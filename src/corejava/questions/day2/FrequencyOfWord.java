package corejava.questions.day2;

import java.util.Scanner;

public class FrequencyOfWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String data = sc.nextLine();
		String arr[] = data.split(" ");
		int n = arr.length;
		String arrCopy[] = new String[n];
		for (int i = 0; i < n; i++) {
			arrCopy[i] = arr[i];
		}
		
		frequencyOfWord(arr,arrCopy);
		
	}

	private static void frequencyOfWord(String[] arr, String[] arrCopy) {
		int count=0,n=arr.length;
		String arrScanned[] = new String[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i].equals(arrCopy[j])) {
					count++;
					//arrScanned[i]=arr[i];
				}
			}
			System.out.println("The frequency of - "+arr[i]+"  is "+count);
			count=0;
		}
	}

}
