package assignments.assignment_6;

public class Question4 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=7; i++ ) {	//do this statement until i equals 7
			
			for(int j=1; j<=i; j++) {
				
				if(j%2!=0) {			//if j is odd print 1
					System.out.print(1);
				}else if(j%2==0) {		//if j is even print 0
					System.out.print(0);
				}
				
			}
			
			System.out.println();
		}

	}

}
