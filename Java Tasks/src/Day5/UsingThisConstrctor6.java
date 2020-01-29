package Day5;

public class UsingThisConstrctor6 {
	
	public UsingThisConstrctor6(String name) {
		
		System.out.println("STRING");
	}
	
	
	public UsingThisConstrctor6(int no){
    this('A');
    System.out.println("INT");
    }
	
	
	public UsingThisConstrctor6(char a){
		this(97668927494l);
		System.out.println("CHAR");
	}
	
	
	public UsingThisConstrctor6(){
		this(987);
		System.out.println("DEFAULT");
	}
	
	
	
	public UsingThisConstrctor6(long ph) {
	this("JAVA");
	System.out.println("LONG");
	}
	
	
	public static void main(String[] args) {
		UsingThisConstrctor6 b=new UsingThisConstrctor6();
	}
	}
