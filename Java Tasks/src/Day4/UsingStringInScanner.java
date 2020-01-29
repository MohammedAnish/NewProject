package Day4;

import java.util.Scanner;

public class UsingStringInScanner {

	private void Words() {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE CHARACTER");

		
		String txt=sc.nextLine();
		if (txt.contains("INDIA")) {
			System.out.println("Ok");
		} else {
System.out.println("not ok");
		}
		
	}
	
	public static void main(String[] args) {
		UsingStringInScanner s=new UsingStringInScanner();
		s.Words();
		
		
		
		
	}
	
	
	
	
	
	
	
}
