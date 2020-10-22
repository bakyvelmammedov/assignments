package assignments.lab_2_assignment;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the charge for the meal: ");
		
		double mealCharge = scan.nextDouble();
		
		double tax = (6.75*mealCharge)/100;		// 6.75 %
		
		double tip = (20.0*(tax+mealCharge))/100;//20.0 % 
		
		double totalBill = mealCharge+tax+tip;	// total
		
		System.out.println("------------------------");
		
		System.out.println("Charge for meal: $ "+mealCharge);
		System.out.println("Tax amount: $ "+tax);
		System.out.println("Tip amount: $ "+tip);
		System.out.println("Total bill: $ "+totalBill);
		
		System.out.println("------------------------");

	}

}
