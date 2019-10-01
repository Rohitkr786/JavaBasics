package corejava.practice;

public class VowelsCount {

	public static void main(String[] args) {
		int count = 0;
		String vowels="aeiou";
		String word="hello world";
		for(int i=0;i<word.length();i++) {
			if(vowels.contains(""+word.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
	}

}
