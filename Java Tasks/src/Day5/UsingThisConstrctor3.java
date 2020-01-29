package Day5;

public class UsingThisConstrctor3 {
	
	public UsingThisConstrctor3() {
		this(123);
		System.out.println("Default");
	}
	public UsingThisConstrctor3(int no){
		System.out.println("INT");
	}
	public static void main(String[] args) {
		UsingThisConstrctor3 c=new UsingThisConstrctor3();
		
	}

}
