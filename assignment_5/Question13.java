package assignments.assignment_5;

public class Question13 {

	public static void main(String[] args) {
		
		for(int row=1; row<=8; row++) {
			if(row%2!=0) {
		
		//for odd row
				for(int i=1; i<=8; i++) {
					
					if(i%2==1) {		//first character of line "W"
						System.out.print("W"+" ");
					}else {
						System.out.print("B"+" ");
					}
					System.out.print(" ");
				}
			}
		
		//for even row
			if(row%2==0) {
				for(int i=1; i<=8; i++) {
					
					if(i%2==1) {		//first character of line "B"
						System.out.print("B"+" ");
					}else {
						System.out.print("W"+" ");
					}
					System.out.print(" ");
				}
			}
				System.out.println();
		}

	}

}
