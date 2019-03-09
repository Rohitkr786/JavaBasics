package corejava.collectionframework.employee;

import java.util.List;

public interface EmployeeContainer {
	Employee addEmployee(Employee emp);
	boolean deleteEmployee(int empno);
	List<Employee> viewEmployee(int empno);
	void viewEmployees();

}
