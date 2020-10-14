package assignments.Lab1_assignment;

public class Question5 {

	public static void main(String[] args) {
		
		caughtSpeeding(60, false);
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);

	}

	public static void caughtSpeeding(int speed, boolean isBirthday) {
		if(isBirthday==false) {
			if(speed<=60) {
				System.out.println("No ticket-0");
			}else if(speed>=61 && speed<=80) {
				System.out.println("Small ticket-1");
			}else if(speed>=81) {
				System.out.println("Big ticket-2");
			}
		}
		if(isBirthday) {
			if(speed<=65) {
				System.out.println("No ticket-0");
			}else if(speed>=66 && speed<=85) {
				System.out.println("Small ticket-1");
			}else if(speed>=85) {
				System.out.println("Big ticket-2");
			}
		}
		
		
	}

}
