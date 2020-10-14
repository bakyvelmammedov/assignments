package assignments.Lab1_assignment;

public class Question3 {

	public static void main(String[] args) {
		
		specialEleven(22);
		specialEleven(23);
		specialEleven(24);

	}

	public static void specialEleven(int i) {
		
		if(i==11 || i%11==0) {
			System.out.println(true);
		}else if((i-1)%11==0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
