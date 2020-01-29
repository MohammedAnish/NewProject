package Day1;

public class EmployeeDetails {
private void empId() {
	System.out.println("emp id is 1234");
}

private void empName() {
	System.out.println("emp name is anish");
}

private void empDob() {
	System.out.println("Dob is 1995");
}
public static void main(String[] args) {
	EmployeeDetails e=new EmployeeDetails();
	e.empId();
	e.empName();
	e.empDob();
}
}
