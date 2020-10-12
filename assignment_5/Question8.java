package assignments.assignment_5;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter upper bound: ");
		
		int upperBound = scan.nextInt();
		
		int i = 1;
		
		int sum=0;
		
		while(i<=upperBound) {
			
			sum=sum+i;	
			
			i++;
		
		}
		System.out.println("Sum of numbers from 1 till "+ upperBound+": "+sum);

	}

}
