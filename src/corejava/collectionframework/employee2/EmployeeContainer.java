package corejava.collectionframework.employee2;

import java.util.List;

import corejava.collectionframework.employee2.Employee;

public interface EmployeeContainer {
	boolean addEmployee(Employee emp);

	boolean deleteEmployee(int empno);

	Employee viewEmployee(int emo);

	void viewEmployees();
}
