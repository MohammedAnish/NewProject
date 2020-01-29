package Day3;

public class SampleAbtsract1 extends Abstract1{

	@Override
	public void bikes() {
		System.out.println("BIKES");		
	}

	@Override
	public void cars() {
		System.out.println("CARS");
		
	}

	@Override
	public void motors() {
		System.out.println("MOTORS");
		
	}

	@Override
	public void bus() {
		System.out.println("BUS");
		
	}

	@Override
	public void lorries() {
		System.out.println("LORRIES");
		
	}
	
	public static void main(String[] args) {
		SampleAbtsract1 s=new SampleAbtsract1();
		s.bikes();
		s.cars();
		s.motors();
		s.lorries();
		s.chumma();
		
		
		
	}

}
