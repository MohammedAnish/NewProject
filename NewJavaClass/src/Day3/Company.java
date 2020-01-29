package Day3;

public class Company implements Client {

	@Override
	public void clientId() {
		System.out.println("Client id 34567");
	}

	public static void main(String[] args) {
		Company c=new Company();
		c.clientId();
	}

}
