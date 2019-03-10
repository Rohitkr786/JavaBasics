package corejava.collectionframework.examquestion;

public class ExamClient {

	public static void main(String[] args) {
		QuestionContainer qc = new QuestionContainerImpl();
		System.out.println("Welcome to java Test");
		qc.beginTest();
		qc.showResult();
		qc.showAnswers();
	}

}
