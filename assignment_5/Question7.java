package assignments.assignment_5;

public class Question7 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100 ; i++) {
			
			if(i%5==0) {
			
				System.out.print(i);
				
				if(i<100) {
					System.out.print(",");
				}else if(i==100) {
					System.out.print(".");
				}
			}
		}

	}

}
