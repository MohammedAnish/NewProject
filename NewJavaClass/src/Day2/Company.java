package Day2;

import org.client.Client;

public class Company extends Client{
	public void companyName() {
		System.out.println("Company name is XXX");
	}
	public static void main(String[] args) {
	Company c=new Company();
	c.clientName();
	c.companyName();
	}

}
