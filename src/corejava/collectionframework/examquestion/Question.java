package corejava.collectionframework.examquestion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Question {
	private String question;
	private String A;
	private String B;
	private String C;
	private String D;
	private String answer;

}
