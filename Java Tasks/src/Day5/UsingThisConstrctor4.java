package Day5;

public class UsingThisConstrctor4 {
	
	public UsingThisConstrctor4() {
		this (123);
		System.out.println("DEFAULT");
	}
	
	public UsingThisConstrctor4(String name){
		this('A');
		System.out.println("STRING");
	}
	
	public UsingThisConstrctor4(char ch){
		System.out.println("CHAR");
	}
	public UsingThisConstrctor4(int no){
		this("JAVA");
		System.out.println("X");
	}
	
	public static void main(String[] args) {
		UsingThisConstrctor4 c=new UsingThisConstrctor4();
	}
}
