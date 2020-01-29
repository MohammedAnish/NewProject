package Day5;

public class UsingSuper1 extends UsingSuper {
	public UsingSuper1(){
		super();
		System.out.println("Default");
	}
	
	public UsingSuper1(int no){
		System.out.println("INT para const");
	}
	
	public static void main(String[] args) {
		UsingSuper1 c=new UsingSuper1();
		UsingSuper1 b=new UsingSuper1(90);
	}

}
