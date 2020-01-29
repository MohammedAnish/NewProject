package Day4;

import java.util.Scanner;

public class Task1 {

	private void Vote() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
		if (age>18) {
			System.out.println("Eligible");
		} else {
System.out.println("Not Eligible");
		}
	}
	public static void main(String[] args) {
	
		Task1 t=new Task1();
		t.Vote();
		
		
		
		
	}
	
	
}
