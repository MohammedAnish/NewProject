package Day5;

public class UsingThisConstrctor2 {
	public UsingThisConstrctor2() {
		this(123);
		System.out.println("Default");
	}
	public UsingThisConstrctor2(int no){
		this("JAVA");
		System.out.println("Int para");
	}
	
	public UsingThisConstrctor2(String name){
		System.out.println("x");
	} 
	
	public static void main(String[] args) {
		UsingThisConstrctor2 c=new UsingThisConstrctor2();
	}

}
