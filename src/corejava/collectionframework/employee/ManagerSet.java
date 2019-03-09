package corejava.collectionframework.employee;

import java.util.List;

public class ManagerSet {

	public static void main(String[] args) {
		EmployeeContainer ec = new EmployeeContainerSet();
		Employee emp = null;
		Employee e = null;
		emp = Employee.builder().ename("rajesh").eno(101).job("Manager").build();
		e = ec.addEmployee(emp);
		showEmployee(e);
		emp = Employee.builder().ename("rajesh").eno(101).job("Manager").build();
		e = ec.addEmployee(emp);
		showEmployee(e);
		ec.viewEmployees();
		
	}

	private static void showEmployee(List<Employee> search) {
		for (Employee e : search) {
			System.out.println("Name " + e.getEname());
			System.out.println("ID " + e.getEno());
			System.out.println("Job is " + e.getJob());
		}

	}

	private static void showEmployee(Employee e) {
		System.out.println("Employee Added Sucessfully with name : " + e.getEname());
	}
	}


