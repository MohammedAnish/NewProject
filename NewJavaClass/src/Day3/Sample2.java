package Day3;

public class Sample2 extends Sample1{
	
	
@Override
public void add(int no) {
	System.out.println("stident id is "+no);
}
private void print() {
	System.out.println("Welcome");

}
@Override
	public void sub() {
		System.out.println("Hello");
	}


public static void main(String[] args) {
	Sample2 s=new Sample2();
	s.add(123);
	s.print();
	s.sub();
}
}
	


