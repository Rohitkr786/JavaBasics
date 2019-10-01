package corejava.collectionframework.employee2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class Employee {
	private int empno;
	private String ename;
	private String job;

	public void showInfo() {
		System.out.println("Finding Employee Details.............");
		System.out.println("Empno : " + empno);
		System.out.println("Emp name : " + ename);
		System.out.println("Emp Job : " + job);
		System.out.println("-----------------");
	}
}
