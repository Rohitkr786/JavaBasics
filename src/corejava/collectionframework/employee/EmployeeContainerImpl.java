package corejava.collectionframework.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeContainerImpl implements EmployeeContainer {

	private List<Employee> list = new ArrayList<>();

	@Override
	public Employee addEmployee(Employee emp) {
		list.add(emp);
		return emp;
	}

	@Override
	public boolean deleteEmployee(int empno) {
		for (Employee e : list) {
			if (e.getEno() == empno) {
				list.remove(e);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Employee> viewEmployee(int empno) {

		List<Employee> searchList = new ArrayList<>();
		for (Employee e : list) {
			if (e.getEno() == empno) {
				searchList.add(e);
			}
		}
		return searchList;
	}

	@Override
	public void viewEmployees() {
		System.out.println("All Employee Details are ");
		System.out.println("-------------------------------------------------------------");
		for (Employee e : list) {
			System.out.println("Name : " + e.getEname() + ", ID : " + e.getEno() + ", Job is : " + e.getJob());
			System.out.println("---------------------------------------------------------");
		}
	}

}
