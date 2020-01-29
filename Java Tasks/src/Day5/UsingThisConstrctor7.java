package Day5;

public class UsingThisConstrctor7 {
	public UsingThisConstrctor7(char ch) {
		
		System.out.println("CHAR");
	}
	
	public UsingThisConstrctor7(){
		this(90989);
		System.out.println("Default");
	}
	
	public UsingThisConstrctor7(long ph){
		this('A');
		System.out.println("LONG");
	}
	
	public UsingThisConstrctor7(int no){
		this("JAVA");
		System.out.println("INT");
	}
		public UsingThisConstrctor7(String name){
			this(9087679863l);	
			System.out.println("STRING");
	}
		
		public static void main(String[] args) {
			UsingThisConstrctor7 c=new UsingThisConstrctor7();
		}
}
