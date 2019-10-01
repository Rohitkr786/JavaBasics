package corejava.practice;

public class ReverseString {

	public static void main(String[] args) {
			String s="hello";
			String sub = "";
			for(char ele : s.toCharArray()) {
				//System.out.println(ele+sub);
				sub = ele+sub;
			}
			System.out.println(sub);
	}

}
