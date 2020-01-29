package Day3;

public class Arts extends Education {
	public void bSc() {
		System.out.println("BSC");

	}
	public void bEd() {
		System.out.println("BED");
	}
	
	public void bA() {
		System.out.println("BA");

	}
	public void ug() {
		System.out.println("UG in OVERRIDE");

	}
	public void pg() {
		System.out.println("PG in OVERRIDE");

	}
	
	public static void main(String[] args) {
		
		Arts a=new Arts();
		a.bSc();
		a.bEd();
		a.bA();
		a.ug();
		a.pg();
		a.chumma();
		
		
	}
	
}
