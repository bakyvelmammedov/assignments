package assignments.lab_2_assignment;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int j = scan.nextInt();
		
		do {
			System.out.println("Enter your next number: ");
			int k = scan.nextInt();
			System.out.println("Do you want to enter another number: 0-No, 1-Yes ");
			int l = scan.nextInt();
			if(l==0) {
				System.out.println("The smallest number is: " + Math.min(k, j));	//finds smallest number
				System.out.println("The largest number is: " + Math.max(k, j));		//finds largest number
				return;		//ends loop
			}
		}while(true);		//if l!=0-->condition is true that's why loop is repeating 
		
		

	}

}
