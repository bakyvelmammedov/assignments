package assignments.lab_2_assignment;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the amount of a purchase: ");
		
		double amountPurchase = scan.nextDouble();
		
		double stateTax = (4*amountPurchase)/100;	// 4 %
		
		double countyTax= (2*amountPurchase)/100;	// 2 %
		
		double totalTax = stateTax+countyTax;		// 4+2=6%
		
		double totalSale= amountPurchase+totalTax;	// total
		
		System.out.println("-------------------------------");
		
		System.out.println("Amount of the purchase: $ "+amountPurchase);
		
		System.out.println("State sales tax: $ "+stateTax);
		
		System.out.println("County sales tax: $ "+countyTax);
		
		System.out.println("Total sales tax: $ "+totalTax);
		
		System.out.println("Total of the sale: $ "+totalSale);
		
		System.out.println("-------------------------------");

	}

}
