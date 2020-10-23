package assignments.lab_2_assignment;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		int smallest = 0;
		
		int largest = 0;
		
		int yesOrNo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first number: ");
		
		int input = scan.nextInt();
		
		smallest = input;
		
		largest = input;
		
		do {
			System.out.println("Enter your next number: ");
			int input2 = scan.nextInt();
			
			if(smallest>=input2) {		//if input1(smallest) is greater than input2
				smallest=input2;	//my smallest number will be input 2
			}else if(largest<=input2){	//if input1(largest) is less than input2
				largest=input2;		//my largest number will be input2
			}
			
			System.out.println("Do you want to enter another number: 0-No, 1-Yes ");
			yesOrNo = scan.nextInt();
			
			if(yesOrNo==0) {
				System.out.println("The smallest number is: " + smallest);	//define smallest number
				System.out.println("The largest number is: " + largest);	//define largest number
				return;		//ends loop
			}
		}while(yesOrNo==1);		//if l!=0-->condition is true that's why loop is repeating 


	}

}
