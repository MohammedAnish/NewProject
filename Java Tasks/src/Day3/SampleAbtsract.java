package Day3;

public  class SampleAbtsract extends Abstract {

	@Override
	public void axis() {
		System.out.println("AXIS BANK");
		
	}

	@Override
	public void sbi() {
		System.out.println("SBI BANK");
		
	}

	@Override
	public void icici() {
		System.out.println("ICIC BANK");
		
	}
	
	public static void main(String[] args) {
		SampleAbtsract s=new SampleAbtsract();
		s.axis();
		s.sbi();
		s.icici();
		s.hdfc();
		
		
		
	}

	
	
	
}
