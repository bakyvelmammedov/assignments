package assignments.assignment_5;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter end number: ");
		
		int endNumber= scan.nextInt();
		
		int i=1;
		
		while(i<=endNumber) {
			if(i%2!=0) {
				System.out.print(i);
				if(endNumber==i+1) {
					System.out.print("");
				}else if(i!=endNumber) {
					System.out.print(",");
				}
			}
			i++;
		}

	}

}
