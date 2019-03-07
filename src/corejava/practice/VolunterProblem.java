package corejava.practice;

public class VolunterProblem {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		int n=15;
		while(n>0) {
			if(a>b)
				b++;
			else
				a++;
			n--;
		}
		System.out.println(a+" "+b+" "+n);
		int min=a>b?(a-b):(b-a);
		System.out.println("Minimum difference is "+min);
	}

}
