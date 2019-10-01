package corejava.collectionframework.employee2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeContainerImpl implements EmployeeContainer {

	Set<Employee> set = new HashSet<>();

	@Override
	public boolean addEmployee(Employee emp) {
		if (viewEmployee(emp.getEmpno()) == null) {
			set.add(emp);
			System.out.println("Employee added successfuly with empno :" + emp.getEmpno());
			return true;
		}
		System.out.println("Employee already exists with empno :" + emp.getEmpno());
		return false;
	}

	@Override
	public boolean deleteEmployee(int empno) {
		Employee emp = viewEmployee(empno);
		if (emp != null) {
			System.out.println("Deleting with empno :" + empno);
			if (set.remove(emp)) {
				System.out.println("Employee deleted successfully");
				return true;
			}
		}
		System.out.println("Employee not found with empno : " + empno);
		return false;
	}

	@Override
	public Employee viewEmployee(int empno) {
		for (Employee emp : set) {
			if (emp.getEmpno() == empno) {
				return emp;
			}
		}
		return null;
	}

	@Override
	public void viewEmployees() {
		if (set.size() != 0) {
			System.out.println("All Employees details");
			for (Employee employee : set) {
				employee.showInfo();
			}
		} else
			System.out.println("No employee found to view");
	}

}
