package Day3;

public class GreenBank extends Icici{

	@Override
	public void saving() {
	System.out.println("2% interest");	
	}
	
	public static void main(String[] args) {
		GreenBank g=new GreenBank();
		g.saving();
		g.deposit();
	}
}
