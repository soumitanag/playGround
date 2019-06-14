package Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {

	private String firstName;
	private String lastName;
	private int salary;
	private String designation;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public static EmployeeDetails setEmployeeDetails() {

		EmployeeDetails emp = new EmployeeDetails();
		emp.setFirstName("Soumita");
		emp.setLastName("Nag");
		emp.setDesignation("CON");
		emp.setSalary(30000);

		return emp;
	}
}
