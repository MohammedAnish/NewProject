package Day2;

public class Education extends Arts {
	public void ug() {
		System.out.println("UG course is BCA");
	}
	public void pg() {
		System.out.println("PG course is MCA");
	}
	
	public static void main(String[] args) {
		Education e=new Education();
		e.bE();
		e.bsc();
		e.pg();
		e.ug();
		
	}

}
