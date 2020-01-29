package Day5;

public class ClassConstrctor1 {
	public ClassConstrctor1() {
		System.out.println("Default");
	}
	public ClassConstrctor1(int no) {
	System.out.println("Int para Const");
	
	}
	public void ClassConstrctor1() {
		System.out.println("Methods");
	}
	
	public static void main(String[] args) {
		
		ClassConstrctor1 c=new ClassConstrctor1();
		ClassConstrctor1 v=new ClassConstrctor1(78);
		c.ClassConstrctor1();
		
	}

}
