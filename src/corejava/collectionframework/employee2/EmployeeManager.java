package corejava.collectionframework.employee2;

public class EmployeeManager {

	public static void main(String[] args) {
		EmployeeContainer emp = new EmployeeContainerImpl();
		emp.addEmployee(Employee.builder().empno(100).ename("Lakshman").job("Sr Developer").build());
		emp.addEmployee(Employee.builder().empno(101).ename("Rajesh").job("Jr Developer").build());
		emp.addEmployee(Employee.builder().empno(102).ename("Manju").job("Jr Developer").build());
		emp.addEmployee(Employee.builder().empno(101).ename("Rajesh").job("Jr Developer").build());
		emp.deleteEmployee(101);
		emp.addEmployee(Employee.builder().empno(101).ename("Rajesh").job("Developer").build());
		Employee employee = emp.viewEmployee(102);
		if (employee != null) {
			System.out.println("Finding Employee Details.............");
			employee.showInfo();
		} else {
			System.out.println("Employee not found");
		}
		emp.viewEmployees();
		emp.deleteEmployee(120);
	}

}
