package assignments.assignment_6;

public class Question5 {

	public static void main(String[] args) {
		
		for(int outerNum=1; outerNum<=7; outerNum++) {			  //first printing '1' then outerNum		
			for(int innerNum=6; innerNum>=outerNum; innerNum--) {
				System.out.print(1);	
			}
			for(int i=1; i<=outerNum ; i++) {
				for(int j=1; j<=outerNum ; j++) {
					System.out.print(outerNum);
					break;
				}
			}
			System.out.println();
		}


	}

}
