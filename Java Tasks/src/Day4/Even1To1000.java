package Day4;

public class Even1To1000 {
	
	private void Number() {
		
		System.out.print("Even");
		System.out.print(" ");
		System.out.println("ODD");
		for (int i = 0; i < 1000; i++) {
			if (i%2==0) {
				System.out.print(i);
				System.out.print(" ");
			}
			if (i%2==1) {
			System.out.println(i);
			System.out.println();
			
	
		}
		}
		}
	
	public static void main(String[] args) {
		
		Even1To1000 e=new Even1To1000();
		e.Number();
	}
	
	
	
	
	
	
	
	
	
	

}
