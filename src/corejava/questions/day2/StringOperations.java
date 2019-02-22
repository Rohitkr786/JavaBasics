package corejava.questions.day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class StringOperations {

	public static void main(String[] args) throws IOException {
		// File file = new File("R:\\Java-Basics-Ws\\CoreJava\\data.txt");
		// BufferedReader br = new BufferedReader(new FileReader(file));
		// String data;
		// int count=0;
//		while ((data = br.readLine()) != null) {
//			count++;
//			String arr[]=data.split("-");
//		}
//		System.out.println(data);
//		System.out.println();

		String dd = "Date Open High Low-22/01/2019	71.51		71.51		71.14\r\n"
				+ "21/01/2019	71.24		71.535		71.125\r\n" + "20/01/2019	71.255		71.255		71.24\r\n"
				+ "18/01/2019	71.04		71.274		70.987\r\n" + "17/01/2019	71.146		71.416		70.972\r\n"
				+ "16/01/2019	71.11		71.265		70.934\r\n" + "15/01/2019	70.75		71.156		70.723\r\n"
				+ "14/01/2019	70.4		70.95		70.36\r\n" + "13/01/2019	70.38		70.38		70.38\r\n"
				+ "11/01/2019	70.43		70.602		70.356\r\n" + "10/01/2019	70.53		70.655		70.318\r\n"
				+ "09/01/2019	70.11		70.647		70.05\r\n" + "08/01/2019	69.806		70.24		69.765\r\n"
				+ "07/01/2019	69.532		69.953		69.255\r\n" + "06/01/2019	69.535		69.535		69.535\r\n"
				+ "04/01/2019	70.115		70.145		69.55\r\n" + "03/01/2019	70.3		70.531		70.034\r\n"
				+ "02/01/2019	69.531		70.255		69.469\r\n" + "01/01/2019	69.635		69.745		69.435";

		String arr[] = dd.split("-");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr));
		}

	}

}
