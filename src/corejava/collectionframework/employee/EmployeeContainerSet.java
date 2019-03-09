package corejava.collectionframework.employee;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeContainerSet implements EmployeeContainer{
	
	
	private Set<Employee> set = new HashSet<>();

	@Override
	public Employee addEmployee(Employee emp) {
		if(!set.add(emp)) {
			System.out.println("Employee already exists ");
		}
		System.out.println("Added");
		return emp;
	}

	@Override
	public boolean deleteEmployee(int empno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> viewEmployee(int empno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void viewEmployees() {
		for(Employee e:set) {
			System.out.println("Name is "+e.getEname());
			System.out.println("Id is "+e.getEno());
			System.out.println("Job is "+e.getJob());
			System.out.println("--------------------");
		}
	}

}
