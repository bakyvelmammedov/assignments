package assignments.assignment_6;

public class Question2 {

	public static void main(String[] args) {
		
		for(int i=0; i<=6; i++) {
			for(int j=1; j<=((-1*i)+7); j++) {	
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=2; i<=7; i++) {		//starts with '2' , I don't want print 1 on first line
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

	}

}
