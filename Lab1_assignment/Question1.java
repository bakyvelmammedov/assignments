package assignments.Lab1_assignment;

public class Question1 {

	public static void main(String[] args) {
		
		stringTimes("Hi", 2);
		stringTimes("Hi", 3);
		stringTimes("Hi", 1);

	}

	public static void stringTimes(String hi, int num) {
		
		if(num==1) {
			System.out.println("Hi");
		}else if(num==2) {
			System.out.println("HiHi");
		}else if(num==3) {
			System.out.println("HiHiHi");
		}else {
			System.out.println("Give number 1 to 3");
		}
		
		
	}

}
