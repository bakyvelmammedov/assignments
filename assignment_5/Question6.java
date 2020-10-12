package assignments.assignment_5;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		int nTerms = scan.nextInt();
		
		int preNum=0, nextNum=1;

		System.out.print("Output: ");
		
		int i=1;
	    
		while(i <= nTerms) {
	       
	    	System.out.print(preNum+", ");
	        
	    	int sum = preNum + nextNum;
	        
	    	preNum = nextNum;
	        
	    	nextNum = sum;
	        
	    	i++;
		
		}   System.out.println("...");
		

	}

}
