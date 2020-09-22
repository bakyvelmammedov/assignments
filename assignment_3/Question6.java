package assignments.assignment_3;

public class Question6 {

	public static void main(String[] args) {
		
		int drinkCupMilligrams = 500;
		int overdose = 10;
		float gram = drinkCupMilligrams/1000F;
		int toOverdose = (int)(overdose/gram);
		
		System.out.println("Number of milligrams in drink: " + drinkCupMilligrams);
		System.out.println("It would take about "+ toOverdose + " drinks for a lethal overdose.");
		

	}

}
