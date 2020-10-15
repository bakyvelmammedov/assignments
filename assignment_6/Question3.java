package assignments.assignment_6;

public class Question3 {

	public static void main(String[] args) {
		
		for(int line=0; line<=6; line++) {				//increasing lines=total line 7
			for(int space=0; space<=line-1; space++) {  //space increases according to Line -1
				System.out.print(" ");
			}
			for(int number=line+1; number<=7; number++) {
				
					System.out.print(number+" ");
				
			}
			System.out.println();
		}
		
		for(int lineB=2; lineB<=7; lineB++) {					
			for(int space=5; space>=lineB-1; space--) {
				System.out.print(" ");
			}
			for(int numberB=8-lineB; numberB<=7; numberB++) { //numbers are decreasing but stil max equality is 7
				System.out.print(numberB+" ");				  //while line is increasing but we decrease a starting number(numberB is starting number)
			}
			System.out.println();
		}

	}

}
