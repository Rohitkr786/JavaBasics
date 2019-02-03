package corejava.questions.day1;

public class Assignment {
	final static int A;
	static {
		A = getA();

	}

	public static void main(String[] args) {
		System.out.println(A);
	}

	public final static int getA() {
		return 1+1;
	}

}
