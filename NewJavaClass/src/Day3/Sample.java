package Day3;

public class Sample {
	private void add(int no) {
		System.out.println("No is"+" "+no);

	}
	
	private void add(String name) {
		System.out.println("String name is "+name);

	}
	
	private void add(int eId, String eName) {
	System.out.println("Emp id & Name is "+eId+"\t"+eName);	
	}
	private void add(String email,int desg) {
		System.out.println("Emp email & Desg is"+"\t"+email+"\t"+desg);

	}
	
	private void add(boolean trueEmp) {
		System.out.println("boolean"+" "+trueEmp);

	}
	
public static void main(String[] args) {
	Sample s=new Sample();
	s.add(1234);
	s.add(false);
	s.add("Muppil");
	s.add("amd@gmail.com",6578 );
}
}
