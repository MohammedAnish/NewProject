package Day4;

import java.util.Scanner;

public class Task2 {
public void Numbers() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	
	
	int num=sc.nextInt();
	
	if (num%2==0) {
		System.out.println("EVEN");
	} else {

	System.out.println("ODD");
}
}

public static void main(String[] args) {
	
	Task2 t=new Task2();
	t.Numbers();
}	
	
}




