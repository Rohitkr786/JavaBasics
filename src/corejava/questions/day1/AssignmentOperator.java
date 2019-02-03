package corejava.questions.day1;

class Test {

}

public class AssignmentOperator {
	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test();
		Test test3 = test1;

		System.out.println(test1 == test2);
		System.out.println(test2 == test3);
		System.out.println(test3==test1);
		
		
	}
}
