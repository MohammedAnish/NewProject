package Day4;

import java.util.Scanner;

public class SalesIncentive {

	public static void main(String[] args) {
		double salesamount,incentive;
		
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the sales amount");
		salesamount =in.nextDouble();
		
		incentive=salesamount*10/100;
		System.out.println("    ");
		System.out.println("    ");
		
		System.out.printf("Incentive amount is %f for a sales amount is %f",incentive,salesamount);
		
		
	}
	
	
}
