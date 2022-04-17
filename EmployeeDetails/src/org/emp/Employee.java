package org.emp;

public class Employee {
	private void empId(String name) {
System.out.println("emplyee name is:" +name);

	}
	private void empId(int empid) {
		System.out.println("emp id:" +empid);
		

	}
	public static void main(String[] args) {
		Employee em = new Employee();
		em.empId(3738);
		em.empId("raja");
	}
}
