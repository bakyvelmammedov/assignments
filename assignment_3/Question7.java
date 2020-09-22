package assignments.assignment_3;

public class Question7 {

	public static void main(String[] args) {
		
		int priceCent, changeCent, quarters, dimes, nickles;

		priceCent = 95;
		changeCent = 100-priceCent;
		quarters = changeCent/25;
		dimes = (changeCent%25)/10;
		nickles = ((changeCent%25)%10)/5;
		
		System.out.println("Price in cents: " + priceCent);
		System.out.println("Your change is " + quarters + " quarters, "+dimes+" dimes, "+ nickles + " nickles");

	}

}
