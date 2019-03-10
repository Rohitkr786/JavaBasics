package corejava.collectionframework.examquestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionContainerImpl implements QuestionContainer {
	private int ccount = 0;
	private int wcount = 0;
	private List<Question> list = null;
	{
		Question q = null;
		list = new ArrayList<Question>();
		q = Question.builder().question("Java is  programming or platform").A("A. Programming").B("B. Platform")
				.C("C. Both").D("D. None of the above").answer("C").build();
		list.add(q);
		q = Question.builder().question("Who is author of Java ").A("A. James Gosling").B("B. Mark").C("C. Both")
				.D("D. None of the above").answer("A").build();
		list.add(q);
		q = Question.builder().question("What is JDK ").A("A. Java Development Kit").B("B. Java Debugging Kit").C("C. Both")
				.D("D. None of the above").answer("A").build();
		list.add(q);
		q = Question.builder().question("One Class have ").A("A. Many Methods").B("B. One main method").C("C. Both")
				.D("D. None of the above").answer("C").build();
		list.add(q);
		q = Question.builder().question("Correct Statement About Strings").A("A. String is Class").B("B. Strings are immutable ").C("C. String has equals method")
				.D("D. All of the above").answer("D").build();
		list.add(q);
		
	}

	@Override
	public void beginTest() {
		Scanner sc = new Scanner(System.in);
		int count=1;
		for (Question q : list) {
			System.out.println("Question No : " +count++ + ")" + q.getQuestion());
			System.out.println("Options are ");
			System.out.println(q.getA() + "\n" + q.getB() + "\n" + q.getC() + "\n" + q.getD());
			// label:
			System.out.println("Enter your Choice :");
			String answer = sc.next().toUpperCase();
			char c = answer.charAt(0);
			if (!(c > 'D' && c < 'A')) {
				if (answer.equals(q.getAnswer().toUpperCase())) {
					ccount++;
				} else {
					wcount++;
				}
			} else {
				System.out.println("Enter only Between A-D");
				// continue label;
			}
			System.out.println("-------------------------------------------------------");
		}
	}

	@Override
	public void showResult() {
		System.out.println("Results are................");
		double percentage = ((float)ccount/list.size())*100;
		System.out.println("Percentage Obtained is : "+percentage);
		if(percentage >=40.0) {
			System.out.println("RESULT : PASS");
		}
		else {			
			System.out.println("RESULT : FAIL");
		}
		System.out.println("Correct answer count : " + ccount);
		System.out.println("Wrong answer Count : " + wcount);
		System.out.println("--------------------------------");
	}

	@Override
	public void showAnswers() {
		System.out.println("Correct answers are ");
		int count=1;
		for(Question q:list) {
			System.out.println("Question no "+count++ +" ) "+q.getQuestion() +"\t Correct Option is "+q.getAnswer());
		}
		
	}

}
