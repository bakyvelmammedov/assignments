package assignments.assignment_5;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int result=0;
		
		while(result<100) {
			
			System.out.println("Enter the number: ");
			
			int num1 = scan.nextInt();
			
			result=num1*10;
			
			System.out.println("Result is: "+result);
			num1++;
		}
		System.out.println("Result is not less than 100");
	}

}
