package Day3;

public class Desktop implements Hardware1,Software1 {

	@Override
	public void softwareResources() {
		System.out.println("softwareResources");
		
	}

	@Override
	public void hardwareResources() {
		System.out.println("hardwareResources");
		
	}
	
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.softwareResources();
		d.hardwareResources();
		
		
		
		
		
		
	}

}
