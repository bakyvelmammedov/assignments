package assignments.Lab1_assignment;

public class Question6 {

	public static void main(String[] args) {
		
		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);

	}

	public static void cigarParty(int cigarNumber, boolean isWeekend) {
		if(isWeekend==false) {
			if(cigarNumber>=40 && cigarNumber<=90) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		if(isWeekend) {
			if(cigarNumber>=40) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
		
	}

}
