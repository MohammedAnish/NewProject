package Day5;

public class UsingThisConstrctor {
	public UsingThisConstrctor() {
		this (123);
		System.out.println("Default constrctor");
	}
		
	public UsingThisConstrctor(int no) {	
	this ("JAVA");
	System.out.println("int para const");
}
	
	public UsingThisConstrctor(String name){
	this ('A');
	System.out.println("String para const");
	
	}
	public UsingThisConstrctor(long phno){
	System.out.println("long para char");
	}
	
	public UsingThisConstrctor(char ch) {
		this (988776533l);
		System.out.println("char paar const");
		
		
	}
	public static void main(String[] args) {
		UsingThisConstrctor c=new UsingThisConstrctor();
		
	}
}
