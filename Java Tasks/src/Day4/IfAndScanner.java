package Day4;

import java.util.Scanner;

public class IfAndScanner {
	private void Vote() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if (age>=18) {
			System.out.println("Eligible");
		} else {
System.out.println("Not Eligible");
		}
		}
	public static void main(String[] args) {
		IfAndScanner v=new IfAndScanner();
		
		v.Vote();
		}
	}
