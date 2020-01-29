package Day1;

public class Employee {
	private void empname() {
		System.out.println("empname");
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		Company z=new Company();
		Client p=new Client();
		e.empname();
		z.companyName();
		p.clientName();
	}
	
}
