package assignments.lab_2_assignment;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number males in class: ");
		
		int numMales = scan.nextInt();

		System.out.println("Enter number females in class: ");
		
		int numFemales = scan.nextInt();
		
		double sum=numMales+numFemales;
		
		System.out.println("Percentage of males: "+((numMales/sum)*100));
		
		System.out.println("Percentage of females: "+((numFemales/sum)*100));

	}

}
