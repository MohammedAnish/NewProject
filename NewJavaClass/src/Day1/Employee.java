package Day1;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	public void empName() {
		System.out.println("Emp is NPO");
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empName();
		Client c=new Client();
			c.clientName();
		Company c1=new Company();
		c1.companyName();
		Project p=new Project();
		p.projectName();
	}

}
