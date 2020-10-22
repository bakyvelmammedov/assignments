package assignments.lab_2_assignment;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		//bag cookies = 40
		//4 cookies = 300 calories
		//1 cookie  = 75 calories
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many cookies you ate:");
		int i = scan.nextInt();
		
		int calories = i*75;
		System.out.println("Total calories consumed: "+calories);

	}

}
