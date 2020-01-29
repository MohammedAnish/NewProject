package Day5;

public class UsingThisConstrctor5 {

	
	public UsingThisConstrctor5(String name) {
		this(123);
		System.out.println("STRING");
	}
	
	public UsingThisConstrctor5(){
		this("JAVA");
		System.out.println("DEFAULT");
	}
	public UsingThisConstrctor5(int no){
this(23445.655f);
		System.out.println("INT");
	}
	
	public UsingThisConstrctor5(long id){
		
		System.out.println("long");
	}
		public UsingThisConstrctor5(float code){
			this(4567788682l);
			System.out.println("byte");
		}
	public static void main(String[] args) {
		UsingThisConstrctor5 c=new UsingThisConstrctor5();
		
	}
}
