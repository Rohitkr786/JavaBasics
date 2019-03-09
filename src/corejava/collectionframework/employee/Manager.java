package corejava.collectionframework.employee;

import java.util.ArrayList;
import java.util.List;

public class Manager {

	public static void main(String[] args) {
		EmployeeContainer ec = new EmployeeContainerImpl();
		Employee emp = null;
		Employee e = null;
		emp = Employee.builder().ename("rajesh").eno(101).job("Manager").build();
		e = ec.addEmployee(emp);
		showEmployee(e);
		emp = Employee.builder().ename("Manju").eno(102).job("Hr").build();
		e = ec.addEmployee(emp);
		showEmployee(e);
		int id = 101;
		List<Employee> search = ec.viewEmployee(id);
		System.out.println("Searching with employee id "+id);
		showEmployee(search);
		System.out.println("-------------");
		ec.viewEmployees();
		int eid=102;
		System.out.println("Deleting with employee id "+eid);
		if (ec.deleteEmployee(eid))
			System.out.println("Employee deleted succesfully with id :"+eid);
		else
			System.out.println("No employee found");

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
