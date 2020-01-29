package Day4;

import java.util.Scanner;

public class UsingStringInScanner1 {

	private void Word() {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word");
		String txt=sc.nextLine();
		if (txt.contains("I AM INDIAN")) {
			System.out.println("ok");
		} else {
System.out.println("Not Ok");
		}
	}
	public static void main(String[] args) {
		UsingStringInScanner1 u=new UsingStringInScanner1();
		u.Word();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
