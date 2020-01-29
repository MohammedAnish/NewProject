package Day3;

public class SampleInterface1 implements Interface1 {

	@Override
	public void prekg() {
		System.out.println("PREKG");
		
	}

	@Override
	public void lkg() {
		System.out.println("PREKG");
		
		
	}

	@Override
	public void schl() {
		System.out.println("SCHL");
		
	}

	@Override
	public void college() {
		System.out.println("COLLEGE");
		
	}

	@Override
	public void office() {
		System.out.println("OFFICE");
		
	}
	
	public static void main(String[] args) {
		
		SampleInterface1 s=new SampleInterface1();
		s.college();
		s.lkg();
		s.prekg();
		s.office();
		s.schl();
		
		
	}

}
