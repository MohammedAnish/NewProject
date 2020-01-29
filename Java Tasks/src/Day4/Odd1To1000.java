package Day4;

public class Odd1To1000 {
	
	private void Odd()
	
	{
		System.out.print("ODD");
		System.out.println(" ");
		for (int i = 0; i < 1000; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
			
			
		}
		}
	
	public static void main(String[] args) {
		Odd1To1000 o=new Odd1To1000();
		o.Odd();
		
		
	}
	
	
	
	
	
	
	

}
