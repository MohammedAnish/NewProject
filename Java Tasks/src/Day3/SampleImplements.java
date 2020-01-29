package Day3;

public class SampleImplements implements Hardware,Software {

	@Override
	public void developing() {
		System.out.println("Developing dev");
		
	}

	@Override
	public void testing() {
		System.out.println("Developing tes");	
	}

	@Override
	public void network() {
		System.out.println("Developing net");
	}

	@Override
	public void components() {
		System.out.println("Developing comp");
		
	}
public static void main(String[] args) {
	SampleImplements s=new SampleImplements();
	s.components();
	s.testing();
	s.developing();
	s.network();
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}
