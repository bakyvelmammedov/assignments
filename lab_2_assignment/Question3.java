package assignments.lab_2_assignment;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter positive nonzero integer value: ");
		
		int input = scan.nextInt();
		
		if(input==0) {
		
			System.out.println("Invalid input");
			
		}else if(input>0) {
			
			for(int i=1; i<=input; i++) {
				
				sum=sum+i;
		}
			System.out.println("Sum of all the integers from 1 up to the "+input+" is:  "+sum);
		
		}
		
		

	}

}
