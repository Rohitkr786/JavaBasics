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
		System.out.println("Employee Details");
		System.out.println(empno);
		System.out.println(ename);
		System.out.println(job);
		System.out.println("-----------------");
	}
}
