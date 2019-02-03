package corejava.questions.day1;

public class Examples {
	public static void main(String[] args) {
		int inp = 29;
		isPrime(inp);
	}

	private static void isPrime(int n) {
		boolean flag = false;
		for (int i = 2; i < n / 2; ++i) {
			if (n / i == 0) {
				flag = true;
				break;
			}

		}
		if(!flag) {
			System.out.println("Its is prime number");
		}
		else {
			System.out.println("Not prime");
		}
		
	}

}
