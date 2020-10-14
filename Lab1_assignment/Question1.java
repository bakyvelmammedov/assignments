package assignments.Lab1_assignment;

public class Question1 {

	public static void main(String[] args) {
		
		stringTimes("Hi", 2);
		stringTimes("Hi", 3);
		stringTimes("Hi", 1);

	}

	public static void stringTimes(String word, int copies) {
		
		if(copies>0) {
			for(int i=1; i<=copies; i++) {
				System.out.print("Hi");
			}
			System.out.println();
		}
		
	}

}
