package Day5;

public class ClassConstructor {

	public ClassConstructor() {
		System.out.println("Default const");
	}
	

public ClassConstructor(int no) {
	
	System.out.println(" int para cont");
	
}
public void ClassConstructor() {
	System.out.println("methods");
	
}
public static void main(String[] args) {
	ClassConstructor s=new ClassConstructor();
	ClassConstructor c1=new ClassConstructor(90);
	s.ClassConstructor();
	
}
}