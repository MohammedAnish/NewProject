package Day3;

public class SampleInterface implements Interface {

	@Override
	public void axis() {
		System.out.println("AXIS BANK");
		
	}

	@Override
	public void sbi() {
		System.out.println("SBI");
		
	}

	@Override
	public void icici() {
		System.out.println("ICIC BANK");
		
	}

	@Override
	public void hdfc() {
		System.out.println("HDFC BANK");
		
	}

	
	public static void main(String[] args) {
		SampleInterface s=new SampleInterface();
		s.axis();
		s.icici();
		s.sbi();
		s.hdfc();
		
		
		
	}
}
